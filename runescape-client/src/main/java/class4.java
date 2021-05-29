import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class4 extends class14 {
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = 1710042496
	)
	static int field47;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -2110888403
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "[Lio;"
	)
	static Widget[] field49;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 82874555
	)
	int field43;
	@ObfuscatedName("n")
	String field40;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class4(class2 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field43 = var1.readInt();
		this.field40 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(class11 var1) {
		var1.method115(this.field43, this.field40);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-402074125"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-23226"
	)
	static final void method47() {
		PacketBufferNode var0 = class21.getPacketBufferNode(ClientPacket.field2594, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class43.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			WorldMapCacheName.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1166427642"
	)
	public static void method50(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class21.getPacketBufferNode(ClientPacket.field2657, Client.packetWriter.isaacCipher);
		var4.packetBuffer.method6602(var1);
		var4.packetBuffer.writeInt(var3 ? Client.field723 : 0);
		var4.packetBuffer.writeByte(var2);
		var4.packetBuffer.method6619(var0);
		Client.packetWriter.addNode(var4);
	}
}
