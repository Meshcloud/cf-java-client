/**
 * 
 */
package org.cloudfoundry.client.lib.domain;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

/**
 * @author Christian Brinker, evoila.
 *
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, creatorVisibility = Visibility.NONE)
public class CloudUsageEvent extends CloudEntity {
	private AppState state;
	private int memoryInMBPerInstance;
	private int instanceCount;
	private String appGUID;
	private String appName;
	private String spaceGUID;
	private String spaceName;
	private String orgGUID;

	public CloudUsageEvent(Meta meta, String name) {
		super(meta, name);
	}

	public enum AppState {
		BUILDPACK_SET, STARTED, STOPPED, UNKNOWN;

		public static AppState valueOfWithDefault(String s) {
			try {
				return AppState.valueOf(s);
			} catch (IllegalArgumentException e) {
				return AppState.UNKNOWN;
			}
		}
	}

	public AppState getState() {
		return state;
	}

	public void setState(AppState state) {
		this.state = state;
	}

	public int getMemoryInMBPerInstance() {
		return memoryInMBPerInstance;
	}

	public void setMemoryInMBPerInstance(int memoryInMBPerInstance) {
		this.memoryInMBPerInstance = memoryInMBPerInstance;
	}

	public int getInstanceCount() {
		return instanceCount;
	}

	public void setInstanceCount(int instanceCount) {
		this.instanceCount = instanceCount;
	}

	public String getAppGUID() {
		return appGUID;
	}

	public void setAppGUID(String appGUID) {
		this.appGUID = appGUID;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getSpaceGUID() {
		return spaceGUID;
	}

	public void setSpaceGUID(String spaceGUID) {
		this.spaceGUID = spaceGUID;
	}

	public String getSpaceName() {
		return spaceName;
	}

	public void setSpaceName(String spaceName) {
		this.spaceName = spaceName;
	}

	public String getOrgGUID() {
		return orgGUID;
	}

	public void setOrgGUID(String orgGUID) {
		this.orgGUID = orgGUID;
	}
}
