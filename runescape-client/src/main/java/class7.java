import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
public class class7 {
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1894406353
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = 542116271
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("s")
	ExecutorService field29;
	@ObfuscatedName("h")
	Future field25;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	final Buffer field26;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class3 field27;

	@ObfuscatedSignature(
		descriptor = "(Lqr;Lv;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field29 = Executors.newSingleThreadExecutor(); // L: 10
		this.field26 = var1; // L: 16
		this.field27 = var2; // L: 17
		this.method51(); // L: 18
	} // L: 19

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-50"
	)
	public boolean method56() {
		return this.field25.isDone(); // L: 22
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-230299666"
	)
	public void method49() {
		this.field29.shutdown(); // L: 26
		this.field29 = null; // L: 27
	} // L: 28

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Lqr;",
		garbageValue = "-4"
	)
	public Buffer method48() {
		try {
			return (Buffer)this.field25.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1069539596"
	)
	void method51() {
		this.field25 = this.field29.submit(new class1(this, this.field26, this.field27)); // L: 40
	} // L: 41

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	static void method60() {
		if (ClientPacket.worldMap != null) { // L: 4294
			ClientPacket.worldMap.method7130(class268.Client_plane, Decimator.baseX * 64 + (ScriptFrame.localPlayer.x >> 7), baseY * 64 + (ScriptFrame.localPlayer.y >> 7), false); // L: 4295
			ClientPacket.worldMap.loadCache(); // L: 4296
		}

	} // L: 4298
}
