package jsonexamp6;

import java.util.List;

public class Features {

	public boolean multi_language_support;
	
	public boolean getIsMulti_language_support() {
		return multi_language_support;
	}
	public void setMulti_language_support(boolean multi_language_support) {
		this.multi_language_support = multi_language_support;
	}
	public List<String> getBeta_features() {
		return beta_features;
	}
	public void setBeta_features(List<String> beta_features) {
		this.beta_features = beta_features;
	}
	public List<String> beta_features;
}
