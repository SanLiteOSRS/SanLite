import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 5479086345961262657L
	)
	long field4466;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 7491885951486581889L
	)
	long field4465;
	@ObfuscatedName("v")
	public boolean field4471;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -5312585389182625375L
	)
	long field4467;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = 3970913436350721287L
	)
	long field4473;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 1046205818457274059L
	)
	long field4469;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 878992559
	)
	int field4470;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1339019647
	)
	int field4464;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 150418445
	)
	int field4472;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1757486459
	)
	int field4468;

	public Timer() {
		this.field4466 = -1L; // L: 7
		this.field4465 = -1L; // L: 8
		this.field4471 = false; // L: 9
		this.field4467 = 0L; // L: 10
		this.field4473 = 0L; // L: 11
		this.field4469 = 0L; // L: 12
		this.field4470 = 0; // L: 13
		this.field4464 = 0; // L: 14
		this.field4472 = 0; // L: 15
		this.field4468 = 0; // L: 16
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1022354551"
	)
	public void method7381() {
		this.field4466 = class153.method3317(); // L: 19
	} // L: 20

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1441360663"
	)
	public void method7379() {
		if (-1L != this.field4466) { // L: 23
			this.field4473 = class153.method3317() - this.field4466; // L: 24
			this.field4466 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-21"
	)
	public void method7393(int var1) {
		this.field4465 = class153.method3317(); // L: 30
		this.field4470 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1971822075"
	)
	public void method7380() {
		if (this.field4465 != -1L) { // L: 35
			this.field4467 = class153.method3317() - this.field4465; // L: 36
			this.field4465 = -1L; // L: 37
		}

		++this.field4472; // L: 39
		this.field4471 = true; // L: 40
	} // L: 41

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	public void method7386() {
		this.field4471 = false; // L: 44
		this.field4464 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1398178117"
	)
	public void method7382() {
		this.method7380(); // L: 49
	} // L: 50

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "8909785"
	)
	@Export("write")
	public void write(Buffer var1) {
		ServerPacket.method5560(var1, this.field4473); // L: 53
		ServerPacket.method5560(var1, this.field4467); // L: 54
		ServerPacket.method5560(var1, this.field4469); // L: 55
		var1.writeShort(this.field4470); // L: 56
		var1.writeShort(this.field4464); // L: 57
		var1.writeShort(this.field4472); // L: 58
		var1.writeShort(this.field4468); // L: 59
	} // L: 60

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-96"
	)
	static void method7404() {
		Tiles.field1010 = null; // L: 65
		class172.field1865 = null; // L: 66
		Tiles.field1011 = null; // L: 67
		Tiles.field1012 = null; // L: 68
		class312.field3717 = null; // L: 69
		Tiles.field1013 = null; // L: 70
		class323.field3794 = null; // L: 71
		class100.Tiles_hue = null; // L: 72
		class161.Tiles_saturation = null; // L: 73
		Tiles.Tiles_lightness = null; // L: 74
		class463.Tiles_hueMultiplier = null; // L: 75
		SceneTilePaint.field2764 = null; // L: 76
	} // L: 77
}
