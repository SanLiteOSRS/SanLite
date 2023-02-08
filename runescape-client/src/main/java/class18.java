import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class18 {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lqp;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("gl")
	static int[] field99;
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	static Widget field102;
	@ObfuscatedName("f")
	Future field100;
	@ObfuscatedName("w")
	String field103;

	class18(Future var1) {
		this.field100 = var1; // L: 10
	} // L: 11

	class18(String var1) {
		this.method276(var1); // L: 14
	} // L: 15

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "13"
	)
	void method276(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field103 = var1; // L: 19
		if (this.field100 != null) { // L: 20
			this.field100.cancel(true); // L: 21
			this.field100 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "17"
	)
	public final String method277() {
		return this.field103; // L: 27
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "125"
	)
	public boolean method282() {
		return this.field103 != null || this.field100 == null; // L: 31
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2116375793"
	)
	public final boolean method279() {
		return this.method282() ? true : this.field100.isDone(); // L: 35 36
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)La;",
		garbageValue = "-1250642886"
	)
	public final class20 method280() {
		if (this.method282()) { // L: 40
			return new class20(this.field103);
		} else if (!this.method279()) { // L: 41
			return null;
		} else {
			try {
				return (class20)this.field100.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method276(var2); // L: 48
				return new class20(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2146984996"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 10283
			Widget var0 = class135.getWidgetChild(class9.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 10284
			if (var0 != null && var0.onTargetLeave != null) { // L: 10285
				ScriptEvent var1 = new ScriptEvent(); // L: 10286
				var1.widget = var0; // L: 10287
				var1.args = var0.onTargetLeave; // L: 10288
				WorldMapAreaData.runScriptEvent(var1); // L: 10289
			}

			Client.selectedSpellItemId = -1; // L: 10291
			Client.isSpellSelected = false; // L: 10292
			LoginScreenAnimation.invalidateWidget(var0); // L: 10293
		}
	} // L: 10294
}
