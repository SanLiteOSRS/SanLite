import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
public class class206 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;

	static {
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-926597754"
	)
	public static void method3837(int var0, int var1, int var2, int var3) {
		if (class319.field3433.size() > 1 && class319.field3433.get(0) != null && ((class331)class319.field3433.get(0)).field3538.isReady() && class319.field3433.get(1) != null && ((class331)class319.field3433.get(1)).field3538.isReady()) { // L: 128
			MouseHandler.method682(var0, var1, var2, var3); // L: 129
			class319.field3435.add(new class415((class421)null)); // L: 130
			ArrayList var4 = new ArrayList(); // L: 131
			var4.add(new class417(new class420((class421)null, 1, false, class319.field3430), class319.field3436)); // L: 132
			var4.add(new class417(new class419((class421)null, 0, false, class319.field3438), class319.field3437)); // L: 133
			class319.field3435.add(new class422((class421)null, var4)); // L: 134
			if (class319.field3440.get(0) != null && class319.field3440.get(1) != null) { // L: 135
				class331 var5 = (class331)class319.field3440.get(0); // L: 136
				class319.field3440.set(0, class319.field3433.get(1)); // L: 137
				class319.field3440.set(1, var5); // L: 138
			}
		}

	} // L: 141
}
