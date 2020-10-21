import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = 1726851723
	)
	static int field2013;
	@ObfuscatedName("z")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lko;Lko;B)I",
		garbageValue = "6"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lic;Lic;ZLkr;I)V",
		garbageValue = "-766510730"
	)
	public static void method3487(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		class231.ItemDefinition_archive = var0;
		ItemComposition.ItemDefinition_modelArchive = var1;
		ItemComposition.ItemDefinition_inMembersWorld = var2;
		class227.ItemDefinition_fileCount = class231.ItemDefinition_archive.getGroupFileCount(10);
		ScriptEvent.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("o")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-773772836"
	)
	static final void method3492(String var0) {
		PacketBufferNode var1 = Client.getPacketBufferNode(ClientPacket.field2315, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(Decimator.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
