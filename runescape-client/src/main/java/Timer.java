import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -5225543966373226735L
	)
	long field3597;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 4082684683626742437L
	)
	long field3602;
	@ObfuscatedName("s")
	public boolean field3598;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -551536066132799497L
	)
	long field3600;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -5071374217160666521L
	)
	long field3601;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 6965498240839128689L
	)
	long field3606;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1025178027
	)
	int field3603;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -931396039
	)
	int field3604;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -531975401
	)
	int field3605;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -76474973
	)
	int field3599;

	public Timer() {
		this.field3597 = -1L;
		this.field3602 = -1L;
		this.field3598 = false;
		this.field3600 = 0L;
		this.field3601 = 0L;
		this.field3606 = 0L;
		this.field3603 = 0;
		this.field3604 = 0;
		this.field3605 = 0;
		this.field3599 = 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1776227441"
	)
	public void method5106() {
		this.field3597 = PacketWriter.currentTimeMillis();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2001375296"
	)
	public void method5098() {
		if (-1L != this.field3597) {
			this.field3601 = PacketWriter.currentTimeMillis() - this.field3597;
			this.field3597 = -1L;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1052633329"
	)
	public void method5110(int var1) {
		this.field3602 = PacketWriter.currentTimeMillis();
		this.field3603 = var1;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "683776298"
	)
	public void method5100() {
		if (-1L != this.field3602) {
			this.field3600 = PacketWriter.currentTimeMillis() - this.field3602;
			this.field3602 = -1L;
		}

		++this.field3605;
		this.field3598 = true;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1997993253"
	)
	public void method5101() {
		this.field3598 = false;
		this.field3604 = 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-729089885"
	)
	public void method5099() {
		this.method5100();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "-1209731041"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field3601;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field3600;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field3606;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field3603);
		var1.writeShort(this.field3604);
		var1.writeShort(this.field3605);
		var1.writeShort(this.field3599);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "98"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + class227.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}
}
