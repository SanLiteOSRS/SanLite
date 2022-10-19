import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = -6291711796372129095L
	)
	long field4401;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -8110696240229183057L
	)
	long field4398;
	@ObfuscatedName("c")
	public boolean field4399;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = 4063476653118069893L
	)
	long field4400;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -661183232158759653L
	)
	long field4397;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 6443664063363474187L
	)
	long field4402;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 667375041
	)
	int field4403;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -242105373
	)
	int field4405;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -436148189
	)
	int field4404;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2086133347
	)
	int field4406;

	public Timer() {
		this.field4401 = -1L; // L: 7
		this.field4398 = -1L; // L: 8
		this.field4399 = false; // L: 9
		this.field4400 = 0L; // L: 10
		this.field4397 = 0L; // L: 11
		this.field4402 = 0L; // L: 12
		this.field4403 = 0; // L: 13
		this.field4405 = 0; // L: 14
		this.field4404 = 0; // L: 15
		this.field4406 = 0; // L: 16
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	public void method7167() {
		this.field4401 = UserComparator8.method2748(); // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1883370213"
	)
	public void method7168() {
		if (-1L != this.field4401) { // L: 23
			this.field4397 = UserComparator8.method2748() - this.field4401; // L: 24
			this.field4401 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-18816"
	)
	public void method7181(int var1) {
		this.field4398 = UserComparator8.method2748(); // L: 30
		this.field4403 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2055594229"
	)
	public void method7184() {
		if (this.field4398 != -1L) { // L: 35
			this.field4400 = UserComparator8.method2748() - this.field4398; // L: 36
			this.field4398 = -1L; // L: 37
		}

		++this.field4404; // L: 39
		this.field4399 = true; // L: 40
	} // L: 41

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1208497835"
	)
	public void method7170() {
		this.field4399 = false; // L: 44
		this.field4405 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	public void method7171() {
		this.method7184(); // L: 49
	} // L: 50

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1944716362"
	)
	@Export("write")
	public void write(Buffer var1) {
		WorldMapRegion.method4963(var1, this.field4397); // L: 53
		WorldMapRegion.method4963(var1, this.field4400); // L: 54
		WorldMapRegion.method4963(var1, this.field4402); // L: 55
		var1.writeShort(this.field4403); // L: 56
		var1.writeShort(this.field4405); // L: 57
		var1.writeShort(this.field4404); // L: 58
		var1.writeShort(this.field4406); // L: 59
	} // L: 60
}
