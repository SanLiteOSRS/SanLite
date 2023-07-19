import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("an")
	@Export("ItemComposition_inMembersWorld")
	public static boolean ItemComposition_inMembersWorld;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -318946437
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 214153453
	)
	@Export("health")
	int health;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -103806585
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -497125179
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1186146816"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "-2141079939"
	)
	static void method2457(ArrayList var0, boolean var1) {
		if (!var1) { // L: 183
			class305.field3398.clear(); // L: 184
		}

		Iterator var2 = var0.iterator(); // L: 186

		while (var2.hasNext()) {
			class317 var3 = (class317)var2.next(); // L: 187
			if (var3.field3509 != -1 && var3.field3508 != -1) { // L: 189
				if (!var1) { // L: 192
					class305.field3398.add(var3); // L: 193
				}

				class305.field3392.add(var3); // L: 195
			}
		}

	} // L: 198
}
