import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class143 extends class151 {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	static IndexedSprite field1647;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("im")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 632047953
	)
	int field1649;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class143(class152 var1) {
		this.this$0 = var1;
		this.field1649 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "85"
	)
	void vmethod3238(Buffer var1) {
		this.field1649 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)V",
		garbageValue = "-1303116736"
	)
	void vmethod3239(ClanChannel var1) {
		var1.removeMember(this.field1649); // L: 96
	} // L: 97

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)V",
		garbageValue = "104"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field739) { // L: 12052
			Client.field717[var0.rootIndex] = true; // L: 12053
		}

	} // L: 12055

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "26"
	)
	public static void method3054(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field2997, Client.packetWriter.isaacCipher); // L: 12734
		var4.packetBuffer.method8434(var2); // L: 12735
		var4.packetBuffer.method8437(var3 ? Client.field586 : 0); // L: 12736
		var4.packetBuffer.method8443(var0); // L: 12737
		var4.packetBuffer.writeIntME(var1); // L: 12738
		Client.packetWriter.addNode(var4); // L: 12739
	} // L: 12740
}
