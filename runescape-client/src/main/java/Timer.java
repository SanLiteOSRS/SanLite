import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 8550403030095862389L
	)
	long field3604;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 7994702175123860963L
	)
	long field3607;
	@ObfuscatedName("l")
	public boolean field3606;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 4133381384365556773L
	)
	long field3608;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = 3557480670410738873L
	)
	long field3605;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 6361595278255869411L
	)
	long field3609;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -134378941
	)
	int field3610;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -337124169
	)
	int field3611;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 2101828205
	)
	int field3612;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1450803179
	)
	int field3613;

	public Timer() {
		this.field3604 = -1L;
		this.field3607 = -1L;
		this.field3606 = false;
		this.field3608 = 0L;
		this.field3605 = 0L;
		this.field3609 = 0L;
		this.field3610 = 0;
		this.field3611 = 0;
		this.field3612 = 0;
		this.field3613 = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-12"
	)
	public void method5135() {
		this.field3604 = Nameable.currentTimeMillis();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "568889217"
	)
	public void method5147() {
		if (this.field3604 != -1L) {
			this.field3605 = Nameable.currentTimeMillis() - this.field3604;
			this.field3604 = -1L;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-391105625"
	)
	public void method5153(int var1) {
		this.field3607 = Nameable.currentTimeMillis();
		this.field3610 = var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "255"
	)
	public void method5137() {
		if (this.field3607 != -1L) {
			this.field3608 = Nameable.currentTimeMillis() - this.field3607;
			this.field3607 = -1L;
		}

		++this.field3612;
		this.field3606 = true;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "20"
	)
	public void method5142() {
		this.field3606 = false;
		this.field3611 = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1427350248"
	)
	public void method5139() {
		this.method5137();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lkb;I)V",
		garbageValue = "-942267659"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field3605;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field3608;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field3609;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field3610);
		var1.writeShort(this.field3611);
		var1.writeShort(this.field3612);
		var1.writeShort(this.field3613);
	}
}
