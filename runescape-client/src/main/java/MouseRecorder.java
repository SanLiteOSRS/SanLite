import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("c")
	public static short[][] field628;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lht;"
	)
	static Widget field621;
	@ObfuscatedName("v")
	public static String field617;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		signature = "Llv;"
	)
	static AbstractSocket field615;
	@ObfuscatedName("f")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("b")
	@Export("lock")
	Object lock;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -973723423
	)
	@Export("index")
	int index;
	@ObfuscatedName("m")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("z")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("q")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; WorldMapSection3.method894(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(II)Llb;",
		garbageValue = "-2124586789"
	)
	public static PrivateChatMode method1287(int var0) {
		PrivateChatMode[] var1 = FloorDecoration.method2989();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PrivateChatMode var3 = var1[var2];
			if (var0 == var3.field3825) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1737054142"
	)
	public static void method1283() {
		VarpDefinition.VarpDefinition_cached.clear();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-500540968"
	)
	static final void method1286() {
		Object var10000 = null;
		String var0 = "You can't add yourself to your own friend list";
		DevicePcmPlayerProvider.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1123050484"
	)
	static final void method1285() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var0.plane == GrandExchangeOfferUnitPriceComparator.Client_plane && !var0.isFinished) {
				if (Client.cycle >= var0.cycleStart) {
					var0.advance(Client.field743);
					if (var0.isFinished) {
						var0.remove();
					} else {
						ModeWhere.scene.drawEntity(var0.plane, var0.x, var0.y, var0.height, 60, var0, 0, -1L, false);
					}
				}
			} else {
				var0.remove();
			}
		}

	}
}
