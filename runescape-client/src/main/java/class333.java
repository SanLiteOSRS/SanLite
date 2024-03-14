import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class333 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	public AbstractArchive field3599;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1197960543
	)
	public int field3590;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -547529051
	)
	public int field3591;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2068932023
	)
	public int field3592;
	@ObfuscatedName("ar")
	public float field3602;
	@ObfuscatedName("as")
	public boolean field3598;
	@ObfuscatedName("aa")
	public boolean field3589;
	@ObfuscatedName("az")
	public boolean field3596;
	@ObfuscatedName("ao")
	public boolean field3597;
	@ObfuscatedName("au")
	boolean field3595;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public MidiPcmStream field3594;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	public SoundCache field3600;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	public MusicTrack field3593;

	@ObfuscatedSignature(
		descriptor = "(Lof;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public class333(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.field3590 = -1;
		this.field3591 = -1;
		this.field3592 = 0;
		this.field3602 = 0.0F;
		this.field3598 = false;
		this.field3597 = false;
		this.field3595 = false;
		this.field3590 = var1.getGroupId(var2); // L: 22
		this.field3591 = var1.getFileId(this.field3590, var3); // L: 23
		this.method6390(var1, this.field3590, this.field3591, var4, var5); // L: 24
	} // L: 25

	@ObfuscatedSignature(
		descriptor = "(Lof;IIIZ)V"
	)
	public class333(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3590 = -1; // L: 8
		this.field3591 = -1; // L: 9
		this.field3592 = 0; // L: 10
		this.field3602 = 0.0F; // L: 11
		this.field3598 = false; // L: 12
		this.field3597 = false; // L: 15
		this.field3595 = false; // L: 16
		this.method6390(var1, var2, var3, var4, var5); // L: 28
	} // L: 29

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;IIIZI)V",
		garbageValue = "1009228261"
	)
	void method6390(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3599 = var1; // L: 32
		this.field3590 = var2; // L: 33
		this.field3591 = var3; // L: 34
		this.field3592 = var4; // L: 35
		this.field3598 = var5; // L: 36
	} // L: 37

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1608518026"
	)
	public static int method6389(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 55
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 56
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 57
		var0 += var0 >>> 8; // L: 58
		var0 += var0 >>> 16; // L: 59
		return var0 & 255; // L: 60
	}
}
