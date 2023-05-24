import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -5348577498961612219L
	)
	long field4485;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -1205622465697215077L
	)
	long field4484;
	@ObfuscatedName("aw")
	public boolean field4483;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -2218855404195630245L
	)
	long field4486;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -6021685739129757585L
	)
	long field4487;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 8532053387917432831L
	)
	long field4488;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1298612247
	)
	int field4489;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -3830165
	)
	int field4490;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1920442979
	)
	int field4491;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1000691937
	)
	int field4492;

	public Timer() {
		this.field4485 = -1L; // L: 7
		this.field4484 = -1L; // L: 8
		this.field4483 = false; // L: 9
		this.field4486 = 0L; // L: 10
		this.field4487 = 0L; // L: 11
		this.field4488 = 0L; // L: 12
		this.field4489 = 0; // L: 13
		this.field4490 = 0; // L: 14
		this.field4491 = 0; // L: 15
		this.field4492 = 0; // L: 16
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1033751982"
	)
	public void method7602() {
		this.field4485 = class96.method2634(); // L: 19
	} // L: 20

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1996100766"
	)
	public void method7613() {
		if (this.field4485 != -1L) { // L: 23
			this.field4487 = class96.method2634() - this.field4485; // L: 24
			this.field4485 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "13"
	)
	public void method7603(int var1) {
		this.field4484 = class96.method2634(); // L: 30
		this.field4489 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1585437622"
	)
	public void method7604() {
		if (-1L != this.field4484) { // L: 35
			this.field4486 = class96.method2634() - this.field4484; // L: 36
			this.field4484 = -1L; // L: 37
		}

		++this.field4491; // L: 39
		this.field4483 = true; // L: 40
	} // L: 41

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-90"
	)
	public void method7605() {
		this.field4483 = false; // L: 44
		this.field4490 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2129657232"
	)
	public void method7606() {
		this.method7604(); // L: 49
	} // L: 50

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-1606158047"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4487; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field4486; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field4488; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field4489); // L: 74
		var1.writeShort(this.field4490); // L: 75
		var1.writeShort(this.field4491); // L: 76
		var1.writeShort(this.field4492); // L: 77
	} // L: 78
}
