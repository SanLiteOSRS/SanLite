import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public class class227 {
	@ObfuscatedName("ac")
	static short[][][] field2543;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Archive field2545;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Leo;"
	)
	class127[] field2541;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1593218477
	)
	int field2542;

	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V"
	)
	class227(Buffer var1, int var2) {
		this.field2541 = new class127[var2]; // L: 13
		this.field2542 = var1.readUnsignedByte(); // L: 14

		for (int var3 = 0; var3 < this.field2541.length; ++var3) { // L: 15
			class127 var4 = new class127(this.field2542, var1, false); // L: 16
			this.field2541[var3] = var4;
		}

		this.method4477();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1763972541"
	)
	void method4477() {
		class127[] var1 = this.field2541; // L: 24

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 25
			class127 var3 = var1[var2]; // L: 26
			if (var3.field1515 >= 0) { // L: 28
				var3.field1525 = this.field2541[var3.field1515]; // L: 29
			}
		}

	} // L: 34

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1286602518"
	)
	public int method4461() {
		return this.field2541.length; // L: 37
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Leo;",
		garbageValue = "-1526328024"
	)
	class127 method4462(int var1) {
		return var1 >= this.method4461() ? null : this.field2541[var1]; // L: 41 42 44
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Leo;",
		garbageValue = "110730333"
	)
	class127[] method4463() {
		return this.field2541; // L: 48
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lfv;II)V",
		garbageValue = "1299283005"
	)
	void method4464(class137 var1, int var2) {
		this.method4465(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lfv;I[ZZB)V",
		garbageValue = "63"
	)
	void method4465(class137 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3059(); // L: 56
		int var6 = 0; // L: 57
		class127[] var7 = this.method4463(); // L: 59

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 60
			class127 var9 = var7[var8]; // L: 61
			if (var3 == null || var4 == var3[var6]) { // L: 63
				var1.method3061(var2, var9, var6, var5); // L: 64
			}

			++var6; // L: 66
		}

	} // L: 70

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lhk;",
		garbageValue = "-1038928775"
	)
	public static VarcInt method4471(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0); // L: 17
		if (var1 != null) { // L: 18
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0); // L: 19
			var1 = new VarcInt(); // L: 20
			if (var2 != null) { // L: 21
				var1.method3606(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0); // L: 22
			return var1; // L: 23
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;Lnu;I)V",
		garbageValue = "1390466926"
	)
	public static void method4479(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		UserComparator2.SequenceDefinition_archive = var0; // L: 51
		VarpDefinition.SequenceDefinition_animationsArchive = var1; // L: 52
		class485.SequenceDefinition_skeletonsArchive = var2; // L: 53
	} // L: 54

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(B)Lsi;",
		garbageValue = "0"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return Canvas.worldMap; // L: 764
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(Lmi;III)V",
		garbageValue = "-767534293"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11980
			if (var0 != null && WorldMapLabelSize.method5059(var0) != null) { // L: 11981
				Client.clickedWidget = var0; // L: 11982
				Client.clickedWidgetParent = WorldMapLabelSize.method5059(var0); // L: 11983
				Client.widgetClickX = var1; // L: 11984
				Client.widgetClickY = var2; // L: 11985
				class159.widgetDragDuration = 0; // L: 11986
				Client.isDraggingWidget = false; // L: 11987
				int var3 = Client.menuOptionsCount - 1; // L: 11990
				if (var3 != -1) { // L: 11993
					class9.tempMenuAction = new MenuAction(); // L: 11994
					class9.tempMenuAction.param0 = Client.menuArguments1[var3]; // L: 11995
					class9.tempMenuAction.param1 = Client.menuArguments2[var3]; // L: 11996
					class9.tempMenuAction.opcode = Client.menuOpcodes[var3]; // L: 11997
					class9.tempMenuAction.identifier = Client.menuIdentifiers[var3]; // L: 11998
					class9.tempMenuAction.field916 = Client.field680[var3]; // L: 11999
					class9.tempMenuAction.field921 = Client.menuActions[var3]; // L: 12000
					class9.tempMenuAction.field922 = Client.menuTargets[var3]; // L: 12001
				}

			}
		}
	} // L: 12003
}
