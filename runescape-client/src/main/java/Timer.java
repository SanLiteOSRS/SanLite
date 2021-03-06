import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("f")
	static String[] field3621;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -2999131098664295081L
	)
	long field3620;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 8703508403484672025L
	)
	long field3611;
	@ObfuscatedName("d")
	public boolean field3616;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 6712649404077510219L
	)
	long field3614;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = 6713522721722477663L
	)
	long field3612;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 4706314381784357345L
	)
	long field3615;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 231611023
	)
	int field3617;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 764593875
	)
	int field3618;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -941214579
	)
	int field3613;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1615778673
	)
	int field3619;

	public Timer() {
		this.field3620 = -1L;
		this.field3611 = -1L;
		this.field3616 = false;
		this.field3614 = 0L;
		this.field3612 = 0L;
		this.field3615 = 0L;
		this.field3617 = 0;
		this.field3618 = 0;
		this.field3613 = 0;
		this.field3619 = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "1",
		signature = "(B)V"
	)
	public void method5212() {
		this.field3620 = Tiles.currentTimeMillis();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-86650625",
		signature = "(I)V"
	)
	public void method5206() {
		if (-1L != this.field3620) {
			this.field3612 = Tiles.currentTimeMillis() - this.field3620;
			this.field3620 = -1L;
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-330894833",
		signature = "(II)V"
	)
	public void method5211(int var1) {
		this.field3611 = Tiles.currentTimeMillis();
		this.field3617 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "40",
		signature = "(B)V"
	)
	public void method5198() {
		if (this.field3611 != -1L) {
			this.field3614 = Tiles.currentTimeMillis() - this.field3611;
			this.field3611 = -1L;
		}

		++this.field3613;
		this.field3616 = true;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "1966837629",
		signature = "(I)V"
	)
	public void method5199() {
		this.field3616 = false;
		this.field3618 = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		garbageValue = "435711064",
		signature = "(I)V"
	)
	public void method5200() {
		this.method5198();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		garbageValue = "-14322",
		signature = "(Lkx;S)V"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field3612;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field3614;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field3615;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field3617);
		var1.writeShort(this.field3618);
		var1.writeShort(this.field3613);
		var1.writeShort(this.field3619);
	}
}
