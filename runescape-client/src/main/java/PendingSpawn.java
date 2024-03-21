import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 513675807
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1632112785
	)
	@Export("type")
	int type;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1681149729
	)
	@Export("x")
	int x;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1122616449
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1123586699
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1514165237
	)
	int field1197;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 448930155
	)
	int field1196;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1410243379
	)
	int field1198;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -650330621
	)
	int field1199;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -50867125
	)
	int field1191;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 739646929
	)
	int field1203;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1655104173
	)
	int field1202;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1161862785
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2100710063
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1202 = 31; // L: 18
		this.delay = 0; // L: 19
		this.hitpoints = -1; // L: 20
	} // L: 22

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "102"
	)
	void method2455(int var1) {
		this.field1202 = var1; // L: 25
	} // L: 26

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2006124018"
	)
	boolean method2460(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 29
			return (this.field1202 & 1 << var1) != 0; // L: 30
		} else {
			return true; // L: 32
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1061121183"
	)
	static void method2459() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-204477510"
	)
	static void method2454() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 61

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 62
			var1.clearIsFromFriend(); // L: 64
		}

	} // L: 67

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "97"
	)
	static void method2458(boolean var0) {
		class333 var2;
		if (var0) { // L: 209
			Iterator var7 = class321.field3474.iterator(); // L: 211

			while (true) {
				do {
					if (!var7.hasNext()) {
						class321.field3474.clear(); // L: 233
						return; // L: 258
					}

					var2 = (class333)var7.next(); // L: 212
				} while(var2 == null); // L: 214

				var2.field3594.clear(); // L: 217
				var2.field3594.method6202(); // L: 218
				var2.field3594.setPcmStreamVolume(0); // L: 219
				var2.field3594.field3518 = 0; // L: 220
				int var3 = var2.field3590; // L: 221
				int var4 = var2.field3591; // L: 222
				Iterator var5 = class321.field3482.iterator(); // L: 224

				while (var5.hasNext()) {
					class327 var6 = (class327)var5.next(); // L: 225
					var6.vmethod6339(var3, var4); // L: 227
				}
			}
		} else {
			for (int var1 = 0; var1 < class321.field3474.size(); ++var1) { // L: 237
				var2 = (class333)class321.field3474.get(var1); // L: 238
				if (var2 == null) { // L: 239
					class321.field3474.remove(var1); // L: 240
					--var1; // L: 241
				} else if (var2.field3595) { // L: 243
					if (var2.field3594.field3518 > 0) { // L: 244
						--var2.field3594.field3518; // L: 245
					}

					var2.field3594.clear(); // L: 247
					var2.field3594.method6202(); // L: 248
					var2.field3594.setPcmStreamVolume(0); // L: 249
					class321.field3474.remove(var1); // L: 250
					--var1; // L: 251
				} else {
					var2.field3595 = true; // L: 254
				}
			}

		}
	}
}
