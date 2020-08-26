import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		longValue = 6214484709053611949L
	)
	static long field553;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Llc;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		signature = "Lln;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("ec")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("k")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("s")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)Lgb;",
		garbageValue = "1985186614"
	)
	static PacketBufferNode method1226() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-90"
	)
	static final void method1213() {
		PacketBufferNode var0 = Client.getPacketBufferNode(ClientPacket.field2336, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class58.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class52.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-158946213"
	)
	static void method1225() {
		if (Client.oculusOrbState == 1) {
			Client.field759 = true;
		}

	}
}
