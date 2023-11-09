import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("LoginPacket")
public class LoginPacket implements class292 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	public static final LoginPacket field3342;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	static final LoginPacket field3346;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	public static final LoginPacket field3343;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	public static final LoginPacket field3344;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	public static final LoginPacket field3345;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	static final LoginPacket field3347;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1205624651
	)
	@Export("id")
	public final int id;

	static {
		field3342 = new LoginPacket(14, 0); // L: 5
		field3346 = new LoginPacket(15, 4); // L: 6
		field3343 = new LoginPacket(16, -2); // L: 7
		field3344 = new LoginPacket(18, -2); // L: 8
		field3345 = new LoginPacket(19, -2); // L: 9
		field3347 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = Decimator.method1086(); // L: 15

		for (int var1 = 0; var1 < var0.length; ++var1) { // L: 16
			LoginPacket_indexedValues[var0[var1].id] = var0[var1]; // L: 17
		}

	} // L: 19

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1; // L: 26
	} // L: 27

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILnq;Ljava/lang/String;Ljava/lang/String;IZI)V",
		garbageValue = "1686859753"
	)
	public static void method5679(int var0, AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		if (var1.isValidFileName(var2, var3)) {
			int var6 = var1.getGroupId(var2);
			int var7 = var1.getFileId(var6, var3);
			class304.musicPlayerStatus = 1; // L: 67
			UserComparator9.musicTrackArchive = var1; // L: 68
			VarbitComposition.musicTrackGroupId = var6; // L: 69
			class304.musicTrackFileId = var7; // L: 70
			class304.musicTrackVolume = var4; // L: 71
			class132.musicTrackBoolean = var5; // L: 72
			class157.pcmSampleLength = var0; // L: 73
		}

	} // L: 76

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1885482155"
	)
	static int method5680(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 63
		if (var1 == null) { // L: 64
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 65 66
		}
	}
}
