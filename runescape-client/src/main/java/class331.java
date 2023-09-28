import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public class class331 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	public AbstractArchive field3544;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1113976665
	)
	public int field3539;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1736344083
	)
	public int field3540;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1137874919
	)
	public int field3541;
	@ObfuscatedName("ao")
	public float field3542;
	@ObfuscatedName("ah")
	public boolean field3543;
	@ObfuscatedName("ar")
	public boolean field3547;
	@ObfuscatedName("ab")
	public boolean field3545;
	@ObfuscatedName("am")
	public boolean field3546;
	@ObfuscatedName("av")
	boolean field3550;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	public MidiPcmStream field3538;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	public SoundCache field3549;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public MusicTrack field3548;

	@ObfuscatedSignature(
		descriptor = "(Lom;IIIZ)V"
	)
	public class331(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3539 = -1;
		this.field3540 = -1;
		this.field3541 = 0;
		this.field3542 = 0.0F;
		this.field3543 = false;
		this.field3546 = false;
		this.field3550 = false;
		this.method6207(var1, var2, var3, var4, var5); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Lom;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public class331(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.field3539 = -1; // L: 8
		this.field3540 = -1; // L: 9
		this.field3541 = 0; // L: 10
		this.field3542 = 0.0F; // L: 11
		this.field3543 = false; // L: 12
		this.field3546 = false; // L: 15
		this.field3550 = false; // L: 16
		this.field3539 = var1.getGroupId(var2); // L: 22
		this.field3540 = var1.getFileId(this.field3539, var3); // L: 23
		this.method6207(var1, this.field3539, this.field3540, var4, var5); // L: 24
	} // L: 25

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;IIIZB)V",
		garbageValue = "-90"
	)
	void method6207(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3544 = var1; // L: 32
		this.field3539 = var2; // L: 33
		this.field3540 = var3; // L: 34
		this.field3541 = var4; // L: 35
		this.field3543 = var5; // L: 36
	} // L: 37

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Lok;Ljava/lang/String;B)V",
		garbageValue = "-43"
	)
	static void method6210(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1428
		Client.archiveLoaders.add(var2); // L: 1429
		Client.field819 += var2.groupCount; // L: 1430
	} // L: 1431
}
