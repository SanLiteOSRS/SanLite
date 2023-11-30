import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 234342989
	)
	public int field4750;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 562110457
	)
	public int field4742;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 780654691
	)
	public int field4743;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 13694239
	)
	public int field4746;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1311751279
	)
	public int field4741;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1701390641
	)
	public int field4745;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 743179747
	)
	public int field4747;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -33272705
	)
	public int field4748;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1954789009
	)
	public int field4749;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1432931155
	)
	public int field4744;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -3788465
	)
	public int field4751;

	public GraphicsDefaults() {
		this.field4750 = -1; // L: 7
		this.field4742 = -1; // L: 8
		this.field4743 = -1; // L: 9
		this.field4746 = -1; // L: 10
		this.field4741 = -1; // L: 11
		this.field4745 = -1; // L: 12
		this.field4747 = -1; // L: 13
		this.field4748 = -1; // L: 14
		this.field4749 = -1; // L: 15
		this.field4744 = -1; // L: 16
		this.field4751 = -1; // L: 17
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;B)V",
		garbageValue = "78"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4737.group); // L: 20
		Buffer var3 = new Buffer(var2); // L: 21

		while (true) {
			int var4 = var3.readUnsignedByte(); // L: 23
			if (var4 == 0) { // L: 24
				return; // L: 51
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium(); // L: 46
				break;
			case 2:
				this.field4750 = var3.method9280(); // L: 31
				this.field4742 = var3.method9280(); // L: 32
				this.field4743 = var3.method9280(); // L: 33
				this.field4746 = var3.method9280(); // L: 34
				this.field4741 = var3.method9280(); // L: 35
				this.field4745 = var3.method9280(); // L: 36
				this.field4747 = var3.method9280(); // L: 37
				this.field4748 = var3.method9280(); // L: 38
				this.field4749 = var3.method9280(); // L: 39
				this.field4744 = var3.method9280(); // L: 40
				this.field4751 = var3.method9280(); // L: 41
			}
		}
	}
}
