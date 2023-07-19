import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1989539703
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1405472465
	)
	@Export("type")
	int type;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1588633461
	)
	@Export("x")
	int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -417956187
	)
	@Export("y")
	int y;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1144413507
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 572029125
	)
	int field1167;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1536696655
	)
	int field1162;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 834759167
	)
	int field1168;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 83355469
	)
	int field1170;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -972441793
	)
	int field1171;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1432515973
	)
	int field1174;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -690386387
	)
	int field1176;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1140977801
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1283168031
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1176 = 31; // L: 18
		this.delay = 0; // L: 19
		this.hitpoints = -1; // L: 20
	} // L: 22

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1948554374"
	)
	void method2418(int var1) {
		this.field1176 = var1; // L: 25
	} // L: 26

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-143597673"
	)
	boolean method2414(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 29
			return (this.field1176 & 1 << var1) != 0; // L: 30
		} else {
			return true; // L: 32
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-385121925"
	)
	static void method2421() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 54

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 55
			var1.clearIsFromFriend(); // L: 57
		}

	} // L: 60
}
