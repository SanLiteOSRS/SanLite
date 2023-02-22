import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
@Implements("ModeWhere")
public enum ModeWhere implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field4334("", 0, new class348[]{class348.field4308}),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field4326("", 1, new class348[]{class348.field4309, class348.field4308}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field4327("", 2, new class348[]{class348.field4309, class348.field4310, class348.field4308}),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field4328("", 3, new class348[]{class348.field4309}),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field4341("", 4),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field4338("", 5, new class348[]{class348.field4309, class348.field4308}),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field4329("", 6, new class348[]{class348.field4308}),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field4332("", 8, new class348[]{class348.field4309, class348.field4308}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field4333("", 9, new class348[]{class348.field4309, class348.field4310}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field4325("", 10, new class348[]{class348.field4309}),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field4337("", 11, new class348[]{class348.field4309}),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field4336("", 12, new class348[]{class348.field4309, class348.field4308}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	field4330("", 13, new class348[]{class348.field4309});

	@ObfuscatedName("tk")
	@ObfuscatedGetter(
		intValue = -1632213005
	)
	static int field4340;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = 794865233
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1835634285
	)
	@Export("id")
	final int id;
	@ObfuscatedName("t")
	final Set field4339;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lmd;)V"
	)
	ModeWhere(String var3, int var4, class348[] var5) {
		this.field4339 = new HashSet();
		this.id = var4; // L: 39
		class348[] var6 = var5; // L: 41

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 42
			class348 var8 = var6[var7]; // L: 43
			this.field4339.add(var8); // L: 44
		}

	} // L: 47

	ModeWhere(String var3, int var4) {
		this.field4339 = new HashSet(); // L: 32
		this.id = var4; // L: 35
	} // L: 36

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 51
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILkz;IIIII[FI)Lkz;",
		garbageValue = "2073812484"
	)
	static Widget method6784(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 896
		var8.type = var0; // L: 897
		var8.parentId = var1.id; // L: 898
		var8.childIndex = var2; // L: 899
		var8.isIf3 = true; // L: 900
		var8.xAlignment = var3; // L: 901
		var8.yAlignment = var4; // L: 902
		var8.widthAlignment = var5; // L: 903
		var8.heightAlignment = var6; // L: 904
		var8.rawX = (int)(var7[0] * (float)var1.width); // L: 905
		var8.rawY = (int)((float)var1.height * var7[1]); // L: 906
		var8.rawWidth = (int)(var7[2] * (float)var1.width); // L: 907
		var8.rawHeight = (int)((float)var1.height * var7[3]); // L: 908
		return var8; // L: 909
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcq;",
		garbageValue = "-837606466"
	)
	static final InterfaceParent method6788(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12897
		var3.group = var1; // L: 12898
		var3.type = var2; // L: 12899
		Client.interfaceParents.put(var3, (long)var0); // L: 12900
		class155.Widget_resetModelFrames(var1); // L: 12901
		Widget var4 = class133.getWidget(var0); // L: 12902
		LoginScreenAnimation.invalidateWidget(var4); // L: 12903
		if (Client.meslayerContinueWidget != null) { // L: 12904
			LoginScreenAnimation.invalidateWidget(Client.meslayerContinueWidget); // L: 12905
			Client.meslayerContinueWidget = null; // L: 12906
		}

		AbstractWorldMapData.revalidateWidgetScroll(WorldMapLabel.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 12908
		SoundCache.runWidgetOnLoadListener(var1); // L: 12909
		if (Client.rootInterface != -1) { // L: 12910
			class147.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 12911
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static void method6787(int var0) {
		if (var0 != Client.loginState) { // L: 13383
			Client.loginState = var0; // L: 13384
		}
	} // L: 13385
}
