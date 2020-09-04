package pc_testing;


import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.ecore.EDataType;

import org.logicng.datastructures.Tristate;
import org.logicng.formulas.FormulaFactory;
import org.logicng.io.parsers.ParserException;
import org.logicng.io.parsers.PropositionalParser;
import org.logicng.solvers.MiniSat;
import org.logicng.solvers.SATSolver;

public class henshinChange {

	public static void main(String[] args) {
		String path = "model/";
		// Create a resource set with a base directory:
		HenshinResourceSet resourceSet = new HenshinResourceSet(path);
				
		// Load the module:
		Module module = resourceSet.getModule("OhMy.henshin", false);

		// Load the example model into an EGraph:
		EGraph graph = new EGraphImpl(resourceSet.getResource("SpaceModel.xmi"));
		//EGraph graph = new EGraphImpl(resourceSet.getResource("example-bank.xmi"));
				
		// Create an engine and a rule application:
		Engine engine = new EngineImpl();
		engine.loadInputSPLFileForLiftedRule("model/spl_test.csv");
		engine.setPathForCSVFileOfOutputSPL("model/output_file.csv");
		UnitApplication jebediah = new UnitApplicationImpl(engine);
		jebediah.setEGraph(graph);
		jebediah.setEGraph(graph);
		System.out.println("Jebediah shall not crash THIS rocket!!!");
		jebediah.setUnit(module.getUnit("jebediah"));

		System.out.println();
		
		UnitApplication Bob = new UnitApplicationImpl(engine);
		Bob.setEGraph(graph);
		Bob.setEGraph(graph);
		System.out.println("Bob shall not crash THIS rocket!!!");
		Bob.setUnit(module.getUnit("addbob"));
			
		
		UnitApplication Bill = new UnitApplicationImpl(engine);
		Bill.setEGraph(graph);
		Bill.setEGraph(graph);
		System.out.println("Bill shall not crash THIS rocket!!!");
		System.out.println("\n\n");
		
		Bill.setUnit(module.getUnit("deletebill"));
		
		System.out.println("bob");
		if (!Bob.execute(null)) {
			throw new RuntimeException("Error creating account for Bob");
		}
		
		/*System.out.println("jeb");
		if (!jebediah.execute(null)) {
			throw new RuntimeException("Error creating account for jeb");
		}*/
		
		/*System.out.println("Bill");
		if (!Bill.execute(null)) {
			throw new RuntimeException("Error creating account for bill");
		}*/
		//System.out.println(graph.getRoots().get(0));
		resourceSet.saveEObject(graph.getRoots().get(0), "SpaceModel1_result.xmi");
		System.out.println("\nSaved result file.");
		
		engine.setPathForCSVFileOfOutputSPL("model/hopingsecond.csv");
		Bob.execute(null);
	}
}
