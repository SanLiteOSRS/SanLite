import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("aq")
	byte[] field3467;
	@ObfuscatedName("aw")
	byte[] field3466;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1546619593
	)
	int field3465;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 955065725
	)
	int field3468;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2123728519
	)
	int field3469;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1834353121
	)
	int field3470;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1077628681
	)
	int field3471;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 349360921
	)
	int field3472;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1864429963
	)
	int field3473;

	MusicPatchNode2() {
	} // L: 14

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "-822937371"
	)
	static void method6109(ArrayList var0, boolean var1) {
		if (!var1) { // L: 167
			class321.field3484.clear(); // L: 168
		}

		Iterator var2 = var0.iterator(); // L: 170

		while (var2.hasNext()) {
			class333 var3 = (class333)var2.next(); // L: 171
			if (var3.field3590 != -1 && var3.field3591 != -1) { // L: 173
				if (!var1) { // L: 176
					class321.field3484.add(var3); // L: 177
				}

				class321.field3478.add(var3); // L: 179
			}
		}

	} // L: 182
}
