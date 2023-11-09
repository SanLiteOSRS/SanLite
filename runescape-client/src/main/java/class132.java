import java.io.File;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class132 extends class128 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1043630541
	)
	int field1572;
	@ObfuscatedName("q")
	byte field1567;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lec;)V"
	)
	class132(class131 var1) {
		this.this$0 = var1;
		this.field1572 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-423569520"
	)
	void vmethod3155(Buffer var1) {
		this.field1572 = var1.readUnsignedShort(); // L: 134
		this.field1567 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-1755436064"
	)
	void vmethod3154(ClanSettings var1) {
		var1.method2983(this.field1572, this.field1567); // L: 139
	} // L: 140

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;B)V",
		garbageValue = "-3"
	)
	public static void method2918(File var0) {
		FileSystem.FileSystem_cacheDir = var0; // L: 16
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 17
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 18
		}
	} // L: 19
}
