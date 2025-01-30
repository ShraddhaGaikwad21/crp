package com.sts.Service;

import java.util.List;
import com.sts.Master.SocialCategoryMaster;

public interface SocialCategoryService {
	 public Boolean addSocialCategoryService(SocialCategoryMaster socialCategoryMaster);
	  public Boolean updateSocialCategoryService(SocialCategoryMaster socialCategoryMaster);
	  public Boolean deleteSocialCategoryService(SocialCategoryMaster socialCategoryMaster);
	  public SocialCategoryMaster getSocialCategoryService(Integer socialCategoryId);
	  public List<SocialCategoryMaster> getAllSocialCategoryService();
}
