import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -2229775801046207963L
	)
	long field3776;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -2890453841099618337L
	)
	long field3772;
	@ObfuscatedName("u")
	public boolean field3773;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -7962001912981584977L
	)
	long field3774;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 8981361987879773313L
	)
	long field3771;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = 329501522501233997L
	)
	long field3778;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1107893853
	)
	int field3775;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1705593105
	)
	int field3777;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 825874723
	)
	int field3779;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2111113097
	)
	int field3780;

	public Timer() {
		this.field3776 = -1L;
		this.field3772 = -1L;
		this.field3773 = false;
		this.field3774 = 0L;
		this.field3771 = 0L;
		this.field3778 = 0L;
		this.field3775 = 0;
		this.field3777 = 0;
		this.field3779 = 0;
		this.field3780 = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2125552653"
	)
	public void method5577() {
		this.field3776 = ObjectSound.currentTimeMillis();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1077201550"
	)
	public void method5578() {
		if (this.field3776 != -1L) {
			this.field3771 = ObjectSound.currentTimeMillis() - this.field3776;
			this.field3776 = -1L;
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "20"
	)
	public void method5579(int var1) {
		this.field3772 = ObjectSound.currentTimeMillis();
		this.field3775 = var1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-44027989"
	)
	public void method5587() {
		if (-1L != this.field3772) {
			this.field3774 = ObjectSound.currentTimeMillis() - this.field3772;
			this.field3772 = -1L;
		}

		++this.field3779;
		this.field3773 = true;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "13"
	)
	public void method5581() {
		this.field3773 = false;
		this.field3777 = 0;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-170289943"
	)
	public void method5582() {
		this.method5587();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lnu;B)V",
		garbageValue = "114"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field3771;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field3774;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field3778;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field3775);
		var1.writeShort(this.field3777);
		var1.writeShort(this.field3779);
		var1.writeShort(this.field3780);
	}
}
