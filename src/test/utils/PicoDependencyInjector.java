package test.utils;

import cucumber.runtime.java.picocontainer.PicoFactory;

public class PicoDependencyInjector extends PicoFactory{
	public PicoDependencyInjector() {
		addClass(Context.class);
	}

}
