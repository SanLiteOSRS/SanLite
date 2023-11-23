import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1554126669
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 382633399
	)
	@Export("health")
	int health;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -799727255
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2048455369
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "857709911"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ldt;",
		garbageValue = "-1907419429"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class47.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = class187.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}
}
