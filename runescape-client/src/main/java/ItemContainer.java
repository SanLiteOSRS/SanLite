import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("ay")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("ar")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public static boolean method2273() {
		if (!class306.field3399.isEmpty()) { // L: 111
			return true; // L: 112
		} else {
			return !class306.field3394.isEmpty() && class306.field3394.get(0) != null && ((class318)class306.field3394.get(0)).field3516 != null ? ((class318)class306.field3394.get(0)).field3516.isReady() : false; // L: 114 115 117
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "409263053"
	)
	static final void method2271(String var0) {
		PacketBufferNode var1 = class503.getPacketBufferNode(ClientPacket.field3168, Client.packetWriter.isaacCipher); // L: 174
		var1.packetBuffer.writeByte(class501.stringCp1252NullTerminatedByteSize(var0)); // L: 175
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 176
		Client.packetWriter.addNode(var1); // L: 177
	} // L: 178
}
