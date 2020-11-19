import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "[Lgk;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 606603159
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lgz;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 532342923
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lks;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -690165039
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1831799327"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1081926235"
	)
	static void method3768() {
		class248.field3216 = new int[2000];
		int var0 = 0;
		int var1 = 240;

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) {
			var3 = Player.method1325((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var0 / 16.0F + 0.075F));
			class248.field3216[var0] = var3;
			++var0;
		}

		var1 = 48;

		for (int var5 = var1 / 6; var0 < class248.field3216.length; var1 -= var5) {
			var3 = var0 * 2;

			for (int var4 = Player.method1325((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < class248.field3216.length; ++var0) {
				class248.field3216[var0] = var4;
			}
		}

	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		signature = "(Lht;IIIIIIB)V",
		garbageValue = "19"
	)
	static final void method3759(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field690) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field690 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !MusicPatchNode.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var0);
				Client.field690 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var0);
			}
		}

	}
}
