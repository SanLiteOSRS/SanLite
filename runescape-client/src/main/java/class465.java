import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
public final class class465 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lro;"
	)
	public static class465[] field4800;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1215965483
	)
	static int field4806;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1786022381
	)
	public static int field4801;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	static IndexedSprite field4805;
	@ObfuscatedName("aj")
	float field4802;
	@ObfuscatedName("aq")
	float field4803;
	@ObfuscatedName("ar")
	float field4804;
	@ObfuscatedName("ag")
	float field4799;

	static {
		field4800 = new class465[0]; // L: 4
		field4806 = 100; // L: 10
		field4800 = new class465[100]; // L: 11
		field4801 = 0; // L: 12
		new class465();
	} // L: 18

	public class465() {
		this.method8515(); // L: 32
	} // L: 33

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-828249912"
	)
	public void method8533() {
		synchronized(field4800) { // L: 26
			if (field4801 < field4806 - 1) { // L: 27
				field4800[++field4801 - 1] = this;
			}

		}
	} // L: 29

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-850756611"
	)
	void method8513(float var1, float var2, float var3, float var4) {
		this.field4802 = var1; // L: 36
		this.field4803 = var2; // L: 37
		this.field4804 = var3; // L: 38
		this.field4799 = var4; // L: 39
	} // L: 40

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFFS)V",
		garbageValue = "22207"
	)
	public void method8514(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4)); // L: 43
		float var6 = (float)Math.cos((double)(0.5F * var4)); // L: 44
		this.field4802 = var1 * var5; // L: 45
		this.field4803 = var2 * var5; // L: 46
		this.field4804 = var3 * var5; // L: 47
		this.field4799 = var6; // L: 48
	} // L: 49

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "108412511"
	)
	public final void method8515() {
		this.field4804 = 0.0F; // L: 52
		this.field4803 = 0.0F; // L: 53
		this.field4802 = 0.0F; // L: 54
		this.field4799 = 1.0F; // L: 55
	} // L: 56

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lro;I)V",
		garbageValue = "574450724"
	)
	public final void method8531(class465 var1) {
		this.method8513(var1.field4803 * this.field4804 + this.field4802 * var1.field4799 + var1.field4802 * this.field4799 - var1.field4804 * this.field4803, var1.field4804 * this.field4802 + this.field4799 * var1.field4803 + (this.field4803 * var1.field4799 - this.field4804 * var1.field4802), var1.field4804 * this.field4799 + (var1.field4802 * this.field4803 + this.field4804 * var1.field4799 - var1.field4803 * this.field4802), var1.field4799 * this.field4799 - this.field4802 * var1.field4802 - var1.field4803 * this.field4803 - var1.field4804 * this.field4804); // L: 59
	} // L: 60

	public int hashCode() {
		boolean var1 = true; // L: 73
		float var2 = 1.0F; // L: 74
		var2 = 31.0F * var2 + this.field4802; // L: 75
		var2 = this.field4803 + var2 * 31.0F; // L: 76
		var2 = this.field4804 + 31.0F * var2; // L: 77
		var2 = this.field4799 + var2 * 31.0F; // L: 78
		return (int)var2; // L: 79
	}

	public String toString() {
		return this.field4802 + "," + this.field4803 + "," + this.field4804 + "," + this.field4799; // L: 84
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class465)) { // L: 64
			return false; // L: 68
		} else {
			class465 var2 = (class465)var1; // L: 65
			return this.field4802 == var2.field4802 && this.field4803 == var2.field4803 && var2.field4804 == this.field4804 && var2.field4799 == this.field4799; // L: 66
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lch;I)V",
		garbageValue = "-1578586943"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1943
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1944
			boolean var1 = var0.isMembersOnly(); // L: 1945
			if (var1 != class507.ItemComposition_inMembersWorld) { // L: 1947
				ItemComposition.ItemComposition_cached.clear(); // L: 1949
				ItemComposition.ItemComposition_cachedModels.clear(); // L: 1950
				ItemComposition.ItemComposition_cachedSprites.clear(); // L: 1951
				class507.ItemComposition_inMembersWorld = var1; // L: 1953
			}
		}

		if (var0.properties != Client.worldProperties) { // L: 1957
			Archive var3 = class19.field94; // L: 1958
			int var2 = var0.properties; // L: 1959
			if ((var2 & class526.field5163.rsOrdinal()) != 0) { // L: 1961
				GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", ""); // L: 1962
			} else if ((var2 & class526.field5164.rsOrdinal()) != 0) { // L: 1964
				GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", ""); // L: 1965
			} else if ((var2 & class526.field5142.rsOrdinal()) != 0) { // L: 1967
				GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var3, "logo_speedrunning", ""); // L: 1968
			} else {
				GrandExchangeEvents.logoSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var3, "logo", ""); // L: 1971
			}
		}

		InvDefinition.worldHost = var0.host; // L: 1975
		Client.worldId = var0.id; // L: 1976
		Client.worldProperties = var0.properties; // L: 1977
		WorldMapCacheName.field2676 = var0.field821; // L: 1978
		SecureRandomCallable.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1979
		class14.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1980
		GrandExchangeOfferOwnWorldComparator.currentPort = SecureRandomCallable.worldPort; // L: 1981
	} // L: 1982
}
