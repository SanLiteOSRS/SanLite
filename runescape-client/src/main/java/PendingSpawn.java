import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("dy")
	static boolean field1169;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = -1716253551
	)
	static int field1167;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -338943587
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 241275811
	)
	@Export("type")
	int type;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -473377439
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -295377785
	)
	@Export("y")
	int y;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 950457513
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 467323589
	)
	int field1157;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1843576419
	)
	int field1158;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1617415071
	)
	int field1162;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1507666767
	)
	int field1160;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -164763093
	)
	int field1161;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1169742593
	)
	int field1152;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1397855747
	)
	int field1159;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -657774781
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2020838527
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1159 = 31; // L: 18
		this.delay = 0; // L: 19
		this.hitpoints = -1; // L: 20
	} // L: 22

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1592817450"
	)
	void method2453(int var1) {
		this.field1159 = var1; // L: 25
	} // L: 26

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "7928"
	)
	boolean method2455(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 29
			return (this.field1159 & 1 << var1) != 0; // L: 30
		} else {
			return true; // L: 32
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "1949440150"
	)
	public static void method2459(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) { // L: 33
			class316.field3416.clear(); // L: 36
			class316.field3413.clear(); // L: 37
			PacketBufferNode.method5917(var5); // L: 38
			class30.method463(var0, var5); // L: 39
			if (!class316.field3416.isEmpty()) { // L: 40
				EnumComposition.method3678(var1, var2, var3, var4); // L: 43
				class316.field3413.add(new class411((class418)null)); // L: 44
				class316.field3413.add(new class420((class418)null, class316.field3423, class316.field3414, class168.field1789)); // L: 45
				ArrayList var6 = new ArrayList(); // L: 46
				var6.add(new class415(new class417((class418)null, 0, true, class316.field3417))); // L: 47
				if (!class316.field3422.isEmpty()) { // L: 48
					ArrayList var7 = new ArrayList(); // L: 49
					var7.add(new class414(new class419((class418)null, var6), class316.field3419)); // L: 50
					ArrayList var9 = new ArrayList(); // L: 53
					Iterator var10 = class316.field3422.iterator(); // L: 54

					while (var10.hasNext()) {
						class328 var11 = (class328)var10.next(); // L: 55
						var9.add(var11); // L: 57
					}

					var7.add(new class414(new class416(new class413((class418)null, var9), 0, false, class316.field3418), class316.field3421)); // L: 63
					class316.field3413.add(new class419((class418)null, var7)); // L: 64
				} else {
					class316.field3413.add(new class414((class418)null, class316.field3419)); // L: 67
					class316.field3413.add(new class419((class418)null, var6)); // L: 68
				}

			}
		}
	} // L: 34 41 70
}
