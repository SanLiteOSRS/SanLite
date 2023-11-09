import java.util.ArrayList;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public class class1 implements Callable {
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	final Buffer field7;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	final class3 field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lan;Ltl;Law;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field7 = var2; // L: 48
		this.field0 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field0.vmethod9(this.field7); // L: 54
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "18980"
	)
	public static void method5(int var0, int var1, int var2, int var3) {
		if (class305.field3397.size() > 1 && class305.field3397.get(0) != null && ((class317)class305.field3397.get(0)).field3511.isReady() && class305.field3397.get(1) != null && ((class317)class305.field3397.get(1)).field3511.isReady()) { // L: 138
			class305.field3401 = var0; // L: 140
			class305.field3400 = var1; // L: 141
			class305.field3403 = var2; // L: 142
			class305.field3402 = var3; // L: 143
			class305.field3393.add(new class400((class406)null)); // L: 145
			ArrayList var4 = new ArrayList(); // L: 146
			var4.add(new class402(new class405((class406)null, 1, false, class305.field3402), class305.field3403)); // L: 147
			var4.add(new class402(new class404((class406)null, 0, false, class305.field3400), class305.field3401)); // L: 148
			class305.field3393.add(new class407((class406)null, var4)); // L: 149
			if (class305.field3398.get(0) != null && class305.field3398.get(1) != null) { // L: 150
				class317 var5 = (class317)class305.field3398.get(0); // L: 151
				class305.field3398.set(0, class305.field3397.get(1)); // L: 152
				class305.field3398.set(1, var5); // L: 153
			}
		}

	} // L: 156

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-302193721"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 5284
			if (GrandExchangeEvent.loadInterface(var0)) { // L: 5285
				Widget[] var1 = class179.Widget_interfaceComponents[var0]; // L: 5286

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 5287
					Widget var3 = var1[var2]; // L: 5288
					if (var3.onLoad != null) { // L: 5289
						ScriptEvent var4 = new ScriptEvent(); // L: 5290
						var4.widget = var3; // L: 5291
						var4.args = var3.onLoad; // L: 5292
						class156.runScript(var4, 5000000, 0); // L: 5293
					}
				}

			}
		}
	} // L: 5296

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "4"
	)
	static void method7(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) { // L: 3789
			int var5 = (Integer)var0.get(0); // L: 3792
			if (var5 == -1 && !Client.playingJingle) { // L: 3793
				class90.method2339(0, 0); // L: 3794
			} else if (var5 != -1) { // L: 3796
				boolean var6;
				if (class305.field3398.isEmpty()) { // L: 3799
					var6 = false; // L: 3804
				} else {
					class317 var7 = (class317)class305.field3398.get(0); // L: 3800
					var6 = var7 != null && var5 == var7.field3509; // L: 3801
				}

				if (!var6 && ScriptFrame.clientPreferences.method2516() != 0) { // L: 3806 3807
					ArrayList var9 = new ArrayList(); // L: 3808

					for (int var8 = 0; var8 < var0.size(); ++var8) { // L: 3809
						var9.add(new class317(class329.archive11, (Integer)var0.get(var8), 0, ScriptFrame.clientPreferences.method2516(), false)); // L: 3810
					}

					if (Client.playingJingle) { // L: 3812
						class305.field3398.clear(); // L: 3814
						class305.field3398.addAll(var9); // L: 3815
						class305.field3401 = var1; // L: 3817
						class305.field3400 = var2; // L: 3818
						class305.field3403 = var3; // L: 3819
						class305.field3402 = var4; // L: 3820
					} else {
						NPCComposition.method3873(var9, var1, var2, var3, var4, false); // L: 3825
					}
				}
			}

		}
	} // L: 3790 3830
}
