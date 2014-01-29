package singleton;

public class Singleton {
	static DeviceManager devManager;
	static public DeviceManager createDeviceManager(){
		if(devManager != null)
			devManager = new DeviceManager();
		return devManager;
	}
}
