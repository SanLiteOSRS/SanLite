import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class178 extends class181 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1708596049
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1197954957
	)
	int field1870;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	final class170 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgu;Ljava/lang/String;I)V"
	)
	class178(class170 var1, String var2, int var3) {
		super(var1, var2); // L: 394
		this.this$0 = var1; // L: 393
		this.field1870 = var3; // L: 395
	} // L: 396

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-3"
	)
	public int vmethod3520() {
		return 0; // L: 399
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2110261497"
	)
	public int vmethod3513() {
		return this.field1870; // L: 404
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;Lni;Lni;B)V",
		garbageValue = "116"
	)
	public static void method3501(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0; // L: 44
		HitSplatDefinition.field2115 = var1; // L: 45
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2; // L: 46
	} // L: 47

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2114359133"
	)
	static void method3499(int var0) {
		class14.method171(14); // L: 2140
		Login.field894 = var0; // L: 2141
	} // L: 2142

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIS)V",
		garbageValue = "-30529"
	)
	static final void method3500(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null; // L: 8241

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8242 8243 8248
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) { // L: 8244
				var10 = var11; // L: 8245
				break;
			}
		}

		if (var10 == null) { // L: 8250
			var10 = new PendingSpawn(); // L: 8251
			var10.plane = var0; // L: 8252
			var10.type = var3; // L: 8253
			var10.x = var1; // L: 8254
			var10.y = var2; // L: 8255
			var10.field1122 = -1; // L: 8256
			class6.method46(var10); // L: 8257
			Client.pendingSpawns.addFirst(var10); // L: 8258
		}

		var10.field1129 = var4; // L: 8260
		var10.field1131 = var5; // L: 8261
		var10.field1130 = var6; // L: 8262
		var10.delay = var8; // L: 8263
		var10.hitpoints = var9; // L: 8264
		var10.method2339(var7); // L: 8265
	} // L: 8266

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ldq;",
		garbageValue = "-43"
	)
	static final InterfaceParent method3490(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12171
		var3.group = var1; // L: 12172
		var3.type = var2; // L: 12173
		Client.interfaceParents.put(var3, (long)var0); // L: 12174
		class383.Widget_resetModelFrames(var1); // L: 12175
		Widget var4 = ArchiveDiskActionHandler.getWidget(var0); // L: 12176
		HorizontalAlignment.invalidateWidget(var4); // L: 12177
		if (Client.meslayerContinueWidget != null) { // L: 12178
			HorizontalAlignment.invalidateWidget(Client.meslayerContinueWidget); // L: 12179
			Client.meslayerContinueWidget = null; // L: 12180
		}

		class166.revalidateWidgetScroll(UserComparator6.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 12182
		class330.runWidgetOnLoadListener(var1); // L: 12183
		if (Client.rootInterface != -1) { // L: 12184
			SpotAnimationDefinition.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 12185
	}
}
