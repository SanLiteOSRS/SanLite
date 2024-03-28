import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("az")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("ah")
	@Export("lock")
	Object lock;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1365818253
	)
	@Export("index")
	int index;
	@ObfuscatedName("at")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("an")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("ao")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; class499.method8677(50L)) { // L: 18 27
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 22
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 23
					++this.index; // L: 24
				}
			}
		}

	} // L: 29

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lis;",
		garbageValue = "-1126485821"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 81
		if (var1 != null) { // L: 82
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 83
			var1 = new ObjectComposition(); // L: 84
			var1.id = var0; // L: 85
			if (var2 != null) { // L: 86
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 87
			if (var1.isSolid) { // L: 88
				var1.interactType = 0; // L: 89
				var1.boolean1 = false; // L: 90
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 92
			return var1; // L: 93
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(S)Ltl;",
		garbageValue = "256"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return ModeWhere.worldMap; // L: 719
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1668694715"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field740 = 0L; // L: 4597
		if (var0 >= 2) { // L: 4598
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4599
		}

		if (class36.getWindowedMode() == 1) { // L: 4600
			UrlRequest.client.setMaxCanvasSize(765, 503); // L: 4601
		} else {
			UrlRequest.client.setMaxCanvasSize(7680, 2160); // L: 4604
		}

		if (Client.gameState >= 25 && Client.packetWriter != null && Client.packetWriter.isaacCipher != null) { // L: 4606 4607
			PacketBufferNode var1 = class425.getPacketBufferNode(ClientPacket.field3278, Client.packetWriter.isaacCipher); // L: 4609
			var1.packetBuffer.writeByte(class36.getWindowedMode()); // L: 4610
			var1.packetBuffer.writeShort(class148.canvasWidth); // L: 4611
			var1.packetBuffer.writeShort(class342.canvasHeight); // L: 4612
			Client.packetWriter.addNode(var1); // L: 4613
		}

	} // L: 4615
}
