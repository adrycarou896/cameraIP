package model;

public class Device {
	
	private long deviceId;
	private String name;
	private String label;
	private long locationId, roomId, deviceTypeId;
	private String deviceTypeName;
	private String deviceNetworkType;
	
	public Device(long deviceId, String name, String label, long locationId, long roomId, long deviceTypeId,
			String deviceTypeName, String deviceNetworkType) {
		super();
		this.deviceId = deviceId;
		this.name = name;
		this.label = label;
		this.locationId = locationId;
		this.roomId = roomId;
		this.deviceTypeId = deviceTypeId;
		this.deviceTypeName = deviceTypeName;
		this.deviceNetworkType = deviceNetworkType;
	}

	public long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(long deviceId) {
		this.deviceId = deviceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public long getDeviceTypeId() {
		return deviceTypeId;
	}

	public void setDeviceTypeId(long deviceTypeId) {
		this.deviceTypeId = deviceTypeId;
	}

	public String getDeviceTypeName() {
		return deviceTypeName;
	}

	public void setDeviceTypeName(String deviceTypeName) {
		this.deviceTypeName = deviceTypeName;
	}

	public String getDeviceNetworkType() {
		return deviceNetworkType;
	}

	public void setDeviceNetworkType(String deviceNetworkType) {
		this.deviceNetworkType = deviceNetworkType;
	}
	
}
