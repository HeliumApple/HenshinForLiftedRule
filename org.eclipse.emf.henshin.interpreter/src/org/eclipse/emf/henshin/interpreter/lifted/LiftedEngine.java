package org.eclipse.emf.henshin.interpreter.lifted;

import org.eclipse.emf.henshin.interpreter.Engine;

public interface LiftedEngine extends Engine {

	/** indicate which file path contains the presence conditions and which file
	// should be used for the new conditions
	 * 
	 */
	void LoadAndWrite(String LoadPath, String ReturnPath);

	// set a new output file
	// remove the need to load the model's information everytime the output file
	// needs to be changed
	void setPathForCSVFileOfOutputSPL(String path);
}
