import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -6502249090114036923L
	)
	long field4513;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -7364488377334788363L
	)
	long field4517;
	@ObfuscatedName("ar")
	public boolean field4514;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -1914781530539160599L
	)
	long field4515;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -2061376141207201857L
	)
	long field4516;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = -715687757076347185L
	)
	long field4520;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2115997317
	)
	int field4512;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -910085273
	)
	int field4519;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -229656591
	)
	int field4518;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 623425463
	)
	int field4521;

	public Timer() {
		this.field4513 = -1L; // L: 7
		this.field4517 = -1L; // L: 8
		this.field4514 = false; // L: 9
		this.field4515 = 0L; // L: 10
		this.field4516 = 0L; // L: 11
		this.field4520 = 0L; // L: 12
		this.field4512 = 0; // L: 13
		this.field4519 = 0; // L: 14
		this.field4518 = 0; // L: 15
		this.field4521 = 0; // L: 16
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2125370355"
	)
	public void method7592() {
		this.field4513 = Canvas.method310(); // L: 19
	} // L: 20

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
	)
	public void method7586() {
		if (-1L != this.field4513) { // L: 23
			this.field4516 = Canvas.method310() - this.field4513; // L: 24
			this.field4513 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "334213446"
	)
	public void method7587(int var1) {
		this.field4517 = Canvas.method310(); // L: 30
		this.field4512 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-27"
	)
	public void method7588() {
		if (this.field4517 != -1L) { // L: 35
			this.field4515 = Canvas.method310() - this.field4517; // L: 36
			this.field4517 = -1L; // L: 37
		}

		++this.field4518; // L: 39
		this.field4514 = true; // L: 40
	} // L: 41

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1020073022"
	)
	public void method7589() {
		this.field4514 = false; // L: 44
		this.field4519 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "84"
	)
	public void method7590() {
		this.method7588(); // L: 49
	} // L: 50

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "2124246090"
	)
	@Export("write")
	public void write(Buffer var1) {
		Projectile.method2102(var1, this.field4516); // L: 53
		Projectile.method2102(var1, this.field4515); // L: 54
		Projectile.method2102(var1, this.field4520); // L: 55
		var1.writeShort(this.field4512); // L: 56
		var1.writeShort(this.field4519); // L: 57
		var1.writeShort(this.field4518); // L: 58
		var1.writeShort(this.field4521); // L: 59
	} // L: 60
}
