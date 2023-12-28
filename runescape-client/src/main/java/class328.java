import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
public class class328 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	public AbstractArchive field3535;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -472615137
	)
	public int field3523;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -244039391
	)
	public int field3531;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1531384173
	)
	public int field3525;
	@ObfuscatedName("ab")
	public float field3528;
	@ObfuscatedName("au")
	public boolean field3527;
	@ObfuscatedName("aa")
	public boolean field3536;
	@ObfuscatedName("ac")
	public boolean field3524;
	@ObfuscatedName("al")
	public boolean field3530;
	@ObfuscatedName("az")
	boolean field3526;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	public MidiPcmStream field3522;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	public SoundCache field3533;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public MusicTrack field3534;

	@ObfuscatedSignature(
		descriptor = "(Lol;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public class328(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.field3523 = -1;
		this.field3531 = -1;
		this.field3525 = 0;
		this.field3528 = 0.0F;
		this.field3527 = false;
		this.field3530 = false;
		this.field3526 = false;
		this.field3523 = var1.getGroupId(var2); // L: 22
		this.field3531 = var1.getFileId(this.field3523, var3); // L: 23
		this.method6250(var1, this.field3523, this.field3531, var4, var5); // L: 24
	} // L: 25

	@ObfuscatedSignature(
		descriptor = "(Lol;IIIZ)V"
	)
	public class328(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3523 = -1; // L: 8
		this.field3531 = -1; // L: 9
		this.field3525 = 0; // L: 10
		this.field3528 = 0.0F; // L: 11
		this.field3527 = false; // L: 12
		this.field3530 = false; // L: 15
		this.field3526 = false; // L: 16
		this.method6250(var1, var2, var3, var4, var5); // L: 28
	} // L: 29

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;IIIZI)V",
		garbageValue = "-2008731586"
	)
	void method6250(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3535 = var1; // L: 32
		this.field3523 = var2; // L: 33
		this.field3531 = var3; // L: 34
		this.field3525 = var4; // L: 35
		this.field3527 = var5; // L: 36
	} // L: 37
}
