import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	field1909(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	field1905(1, 2);

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "[Luz;"
	)
	static SpritePixels[] field1908;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1872109103
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1196350151
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lld;",
		garbageValue = "-863810784"
	)
	public static PacketBufferNode method3686() {
		PacketBufferNode var0;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 44
			var0 = new PacketBufferNode(); // L: 45
		} else {
			var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 48
		}

		var0.clientPacket = null; // L: 51
		var0.clientPacketLength = 0; // L: 52
		var0.packetBuffer = new PacketBuffer(5000); // L: 53
		return var0; // L: 54
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1945756897"
	)
	public static int method3687(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 97
		return (var0 + var2) / var1 - var2; // L: 98
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(Lnn;III)V",
		garbageValue = "-79973183"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 12083
			if (var0 != null && ArchiveDiskAction.method6885(var0) != null) { // L: 12084
				Client.clickedWidget = var0; // L: 12085
				Client.clickedWidgetParent = ArchiveDiskAction.method6885(var0); // L: 12086
				Client.widgetClickX = var1; // L: 12087
				Client.widgetClickY = var2; // L: 12088
				class148.widgetDragDuration = 0; // L: 12089
				Client.isDraggingWidget = false; // L: 12090
				int var3 = Client.menuOptionsCount - 1; // L: 12093
				if (var3 != -1) { // L: 12096
					PcmPlayer.method846(var3);
				}

			}
		}
	} // L: 12097
}
