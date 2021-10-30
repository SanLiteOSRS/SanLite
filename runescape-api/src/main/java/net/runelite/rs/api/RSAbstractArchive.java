package net.runelite.rs.api;

import net.runelite.api.IndexDataBase;
import net.runelite.mapping.Import;

public interface RSAbstractArchive extends IndexDataBase
{
	@Import("takeFile")
	byte[] getConfigData(int archiveId, int fileId);

	@Import("getGroupFileIds")
	@Override
	int[] getFileIds(int groupId);

	@Import("groupCount")
	int getGroupCount();

	@Import("fileIds")
	int[][] getFileIds();

	@Import("getFile")
	byte[] getFile(int groupId, int fileId);

	@Import("getGroupFileCount")
	int getGroupFileCount(int groupId);

	@Import("fileCounts")
	int[] getFileCounts();
}
