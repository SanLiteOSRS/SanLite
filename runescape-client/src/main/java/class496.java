import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tn")
public class class496 extends class498 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -230506827
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 618556217
	)
	int field4975;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -331728869
	)
	int field4972;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1973859157
	)
	int field4970;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1689296487
	)
	int field4973;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1749243225
	)
	int field4974;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 113974539
	)
	int field4976;

	public class496(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8); // L: 12
		this.field4975 = 0; // L: 4
		this.field4972 = 0; // L: 5
		this.field4970 = 0; // L: 6
		this.field4973 = 0; // L: 7
		this.field4974 = 0; // L: 8
		this.field4976 = 0; // L: 9
		this.field4975 = var1; // L: 13
		this.field4972 = var2; // L: 14
		this.field4970 = var3; // L: 15
		this.field4973 = var4; // L: 16
		this.field4974 = var5; // L: 17
		this.field4976 = var6; // L: 18
	} // L: 19

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1316582552"
	)
	public int vmethod8869() {
		double var1 = this.method8876(); // L: 22
		return (int)Math.round(var1 * (double)(this.field4973 - this.field4975) + (double)this.field4975); // L: 23
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1514290339"
	)
	public int vmethod8868() {
		double var1 = this.method8876(); // L: 27
		return (int)Math.round(var1 * (double)(this.field4974 - this.field4972) + (double)this.field4972); // L: 28
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-79"
	)
	public int vmethod8874() {
		double var1 = this.method8876(); // L: 32
		return (int)Math.round(var1 * (double)(this.field4976 - this.field4970) + (double)this.field4970); // L: 33
	}
}
