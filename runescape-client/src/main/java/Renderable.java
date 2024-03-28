import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("tw")
	@ObfuscatedGetter(
		intValue = -1717089125
	)
	static int field2716;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 1760673469
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "1157175232"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("dd")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	} // L: 16

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "-1122381163"
	)
	public static void method4881(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) { // L: 37
			class321.field3500.clear(); // L: 40
			class321.field3498.clear(); // L: 41
			class426.method7848(var5); // L: 42
			class139.method3118(var0, var5); // L: 43
			if (!class321.field3500.isEmpty()) { // L: 44
				WorldMapSection2.method5289(var1, var2, var3, var4); // L: 47
				class321.field3498.add(new class419((class426)null)); // L: 48
				class321.field3498.add(new class428((class426)null, class321.field3493, class321.field3494, class321.field3497)); // L: 49
				ArrayList var6 = new ArrayList(); // L: 50
				var6.add(new class423(new class425((class426)null, 0, true, class321.field3503))); // L: 51
				if (!class321.field3495.isEmpty()) { // L: 52
					ArrayList var7 = new ArrayList(); // L: 53
					var7.add(new class422(new class427((class426)null, var6), class321.field3502)); // L: 54
					ArrayList var9 = new ArrayList(); // L: 57
					Iterator var10 = class321.field3495.iterator(); // L: 58

					while (var10.hasNext()) {
						class333 var11 = (class333)var10.next(); // L: 59
						var9.add(var11); // L: 61
					}

					var7.add(new class422(new class424(new class421((class426)null, var9), 0, false, class321.field3501), class321.field3492)); // L: 67
					class321.field3498.add(new class427((class426)null, var7)); // L: 68
				} else {
					class321.field3498.add(new class422((class426)null, class321.field3502)); // L: 71
					class321.field3498.add(new class427((class426)null, var6)); // L: 72
				}

			}
		}
	} // L: 38 45 74
}
