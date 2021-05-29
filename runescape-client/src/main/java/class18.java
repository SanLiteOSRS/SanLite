import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class18 extends class14 {
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = -1469899117
	)
	static int field153;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = 1439588607
	)
	static int field156;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -6310115608975141981L
	)
	public static long field159;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 393303047
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("gj")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -918629571
	)
	int field157;
	@ObfuscatedName("n")
	boolean field150;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class18(class2 var1) {
		this.this$0 = var1;
		this.field157 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field157 = var1.readUnsignedShort();
		this.field150 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(class11 var1) {
		var1.method110(this.field157, this.field150);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-52"
	)
	public static int method213(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-41"
	)
	static final void method216(int var0, int var1, boolean var2) {
		if (Client.field871[var0] != null) {
			if (var1 >= 0 && var1 < Client.field871[var0].method27()) {
				class9 var3 = (class9)Client.field871[var0].field28.get(var1);
				PacketWriter var4 = Client.packetWriter;
				PacketBufferNode var5 = class21.getPacketBufferNode(ClientPacket.field2607, var4.isaacCipher);
				var5.packetBuffer.writeByte(4 + Tiles.stringCp1252NullTerminatedByteSize(var3.field84));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeBoolean(var2);
				var5.packetBuffer.writeStringCp1252NullTerminated(var3.field84);
				var4.addNode(var5);
			}
		}
	}
}
