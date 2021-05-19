import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -5619312364821349651L
	)
	long field3794;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 8217755253567710943L
	)
	long field3790;
	@ObfuscatedName("o")
	public boolean field3791;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = -6403892094001703111L
	)
	long field3793;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 1011813193105859669L
	)
	long field3800;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -6711688434827611249L
	)
	long field3792;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1385992935
	)
	int field3795;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1180212987
	)
	int field3797;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1981469859
	)
	int field3798;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1196170195
	)
	int field3799;

	public Timer() {
		this.field3794 = -1L;
		this.field3790 = -1L;
		this.field3791 = false;
		this.field3793 = 0L;
		this.field3800 = 0L;
		this.field3792 = 0L;
		this.field3795 = 0;
		this.field3797 = 0;
		this.field3798 = 0;
		this.field3799 = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-534715452"
	)
	public void method5463() {
		this.field3794 = Archive.currentTimeMillis();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "662219834"
	)
	public void method5464() {
		if (this.field3794 != -1L) {
			this.field3800 = Archive.currentTimeMillis() - this.field3794;
			this.field3794 = -1L;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1375613565"
	)
	public void method5465(int var1) {
		this.field3790 = Archive.currentTimeMillis();
		this.field3795 = var1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "562136549"
	)
	public void method5466() {
		if (-1L != this.field3790) {
			this.field3793 = Archive.currentTimeMillis() - this.field3790;
			this.field3790 = -1L;
		}

		++this.field3798;
		this.field3791 = true;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "110"
	)
	public void method5467() {
		this.field3791 = false;
		this.field3797 = 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method5477() {
		this.method5466();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "127"
	)
	@Export("write")
	public void write(Buffer var1) {
		WorldMapIcon_1.method3181(var1, this.field3800);
		WorldMapIcon_1.method3181(var1, this.field3793);
		WorldMapIcon_1.method3181(var1, this.field3792);
		var1.writeShort(this.field3795);
		var1.writeShort(this.field3797);
		var1.writeShort(this.field3798);
		var1.writeShort(this.field3799);
	}
}
