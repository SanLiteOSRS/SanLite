import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public class class245 {
	@ObfuscatedName("h")
	public static final short[] field2949;
	@ObfuscatedName("c")
	public static final short[][] field2948;
	@ObfuscatedName("o")
	public static final short[] field2950;
	@ObfuscatedName("g")
	public static final short[][] field2951;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("Widget_modelsArchive")
	static AbstractArchive Widget_modelsArchive;

	static {
		field2949 = new short[]{6798, 8741, 25238, 4626, 4550};
		field2948 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}};
		field2950 = new short[]{-10304, 9104, -1, -1, -1};
		field2951 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]};
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "13"
	)
	static final boolean method4648() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-2010695069"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = PacketWriter.getWidgetChild(var1, var2);
		if (var5 != null) {
			if (var5.onOp != null) {
				ScriptEvent var6 = new ScriptEvent();
				var6.widget = var5;
				var6.opIndex = var0;
				var6.targetName = var4;
				var6.args = var5.onOp;
				class259.runScriptEvent(var6);
			}

			boolean var8 = true;
			if (var5.contentType > 0) {
				var8 = WorldMapSprite.method3580(var5);
			}

			if (var8) {
				if (class125.method2507(class26.getWidgetFlags(var5), var0 - 1)) {
					PacketBufferNode var7;
					if (var0 == 1) {
						var7 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2581, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 2) {
						var7 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2631, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 3) {
						var7 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2609, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 4) {
						var7 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2592, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 5) {
						var7 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2585, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 6) {
						var7 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2659, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 7) {
						var7 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2587, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 8) {
						var7 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2606, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 9) {
						var7 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2632, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

					if (var0 == 10) {
						var7 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2625, Client.packetWriter.isaacCipher);
						var7.packetBuffer.writeInt(var1);
						var7.packetBuffer.writeShort(var2);
						var7.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var7);
					}

				}
			}
		}
	}
}
