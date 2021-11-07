import java.awt.Image;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("d")
public class class19 {
	@ObfuscatedName("at")
	static Image field89;
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = -1107399791
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("i")
	Future field92;
	@ObfuscatedName("w")
	String field90;

	class19(Future var1) {
		this.field92 = var1;
	}

	class19(String var1) {
		this.method278(var1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1091176174"
	)
	void method278(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.field90 = var1;
		if (this.field92 != null) {
			this.field92.cancel(true);
			this.field92 = null;
		}

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	public final String method293() {
		return this.field90;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "390878741"
	)
	public boolean method276() {
		return this.field90 != null || this.field92 == null;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1402334300"
	)
	public final boolean method280() {
		return this.method276() ? true : this.field92.isDone();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lm;",
		garbageValue = "-2099684088"
	)
	public final class21 method281() {
		if (this.method276()) {
			return new class21(this.field90);
		} else if (!this.method280()) {
			return null;
		} else {
			try {
				return (class21)this.field92.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method278(var2);
				return new class21(var2);
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-394554028"
	)
	public static boolean method279(int var0) {
		return (var0 >> 21 & 1) != 0;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-444636057"
	)
	static int method290(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget;
		}

		class184.invalidateWidget(var3);
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = HealthBarDefinition.localPlayer.appearance.getChatHeadId();
				return 1;
			} else {
				return 2;
			}
		} else {
			class14.Interpreter_intStackSize -= 2;
			int var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
			int var5 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = TaskHandler.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3106 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3106;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "69"
	)
	static final int method291(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = DynamicObject.method2002(var3, var5);
		int var8 = DynamicObject.method2002(var3 + 1, var5);
		int var9 = DynamicObject.method2002(var3, var5 + 1);
		int var10 = DynamicObject.method2002(var3 + 1, var5 + 1);
		int var11 = Messages.method2376(var7, var8, var4, var2);
		int var12 = Messages.method2376(var9, var10, var4, var2);
		return Messages.method2376(var11, var12, var6, var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-165591138"
	)
	public static String method277(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				char var6;
				if (var5 != 181 && var5 != 402) {
					var6 = Character.toTitleCase(var5);
				} else {
					var6 = var5;
				}

				var5 = var6;
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1058992948"
	)
	static final void method289() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		class87.method2223();
		ArchiveDisk.method6322();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		CollisionMap.method3492();
		class78.method2078();
		ScriptFrame.method1117();
		VarbitComposition.VarbitDefinition_cached.clear();
		VarpDefinition.VarpDefinition_cached.clear();
		FileSystem.field1564.method6811();
		class240.HitSplatDefinition_cachedSprites.method6811();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		FileSystem.method2908();
		StructComposition.StructDefinition_cached.clear();
		ParamComposition.ParamDefinition_cached.clear();
		WorldMapElement.WorldMapElement_cachedSprites.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PacketWriter.method2401();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		InvDefinition.archive0.clearFiles();
		ApproximateRouteStrategy.archive1.clearFiles();
		ParamComposition.archive3.clearFiles();
		class12.archive4.clearFiles();
		class11.archive5.clearFiles();
		Messages.archive6.clearFiles();
		HorizontalAlignment.archive7.clearFiles();
		GrandExchangeOfferOwnWorldComparator.archive8.clearFiles();
		SecureRandomFuture.archive9.clearFiles();
		ChatChannel.archive10.clearFiles();
		AbstractWorldMapIcon.archive11.clearFiles();
		class14.archive12.clearFiles();
	}
}
