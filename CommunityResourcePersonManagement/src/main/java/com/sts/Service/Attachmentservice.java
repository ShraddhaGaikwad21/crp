package com.sts.Service;

import java.util.List;

import com.sts.Master.AttachmentMaster;
public interface Attachmentservice {
	  public Boolean addAttachmentService(AttachmentMaster attachmentMaster);
	  public Boolean updateAttachmentService(AttachmentMaster attachmentMaster);
	  public Boolean deleteAttachmentService(AttachmentMaster attachmentMaster);
	  public AttachmentMaster getAttachmentService(Integer attachmentId);
	  public List<AttachmentMaster> getAllAttachmentService();
	    

}
