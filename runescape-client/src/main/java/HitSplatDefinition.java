import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	static AbstractArchive field1799;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("p")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1566126037
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2057498117
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -960185975
	)
	public int field1805;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -722283867
	)
	int field1809;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1206908659
	)
	int field1813;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 289668931
	)
	int field1798;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 349750373
	)
	int field1811;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2034733799
	)
	public int field1812;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1578977171
	)
	public int field1807;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -256974621
	)
	public int field1814;
	@ObfuscatedName("m")
	String field1815;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1437250481
	)
	public int field1816;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -379140099
	)
	public int field1820;
	@ObfuscatedName("h")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 880580953
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1573055713
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field1805 = 70;
		this.field1809 = -1;
		this.field1813 = -1;
		this.field1798 = -1;
		this.field1811 = -1;
		this.field1812 = 0;
		this.field1807 = 0;
		this.field1814 = -1;
		this.field1815 = "";
		this.field1816 = -1;
		this.field1820 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "2128528466"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "-1870837993"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method6946();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field1809 = var1.method6946();
		} else if (var2 == 4) {
			this.field1798 = var1.method6946();
		} else if (var2 == 5) {
			this.field1813 = var1.method6946();
		} else if (var2 == 6) {
			this.field1811 = var1.method6946();
		} else if (var2 == 7) {
			this.field1812 = var1.readShort();
		} else if (var2 == 8) {
			this.field1815 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field1805 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field1807 = var1.readShort();
		} else if (var2 == 11) {
			this.field1814 = 0;
		} else if (var2 == 12) {
			this.field1816 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field1820 = var1.readShort();
		} else if (var2 == 14) {
			this.field1814 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lfl;",
		garbageValue = "-1137405392"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class119.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? Canvas.method372(var2) : null;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2122770328"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field1815;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + MusicPatchNode2.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "1867638082"
	)
	public SpritePixels method3256() {
		if (this.field1809 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1809);
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapSection0.SpriteBuffer_getSprite(field1799, this.field1809, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1809);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Low;",
		garbageValue = "-49"
	)
	public SpritePixels method3286() {
		if (this.field1813 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1813);
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapSection0.SpriteBuffer_getSprite(field1799, this.field1813, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1813);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)Low;",
		garbageValue = "16101"
	)
	public SpritePixels method3258() {
		if (this.field1798 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1798);
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapSection0.SpriteBuffer_getSprite(field1799, this.field1798, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1798);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Low;",
		garbageValue = "64"
	)
	public SpritePixels method3281() {
		if (this.field1811 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field1811);
			if (var1 != null) {
				return var1;
			} else {
				var1 = WorldMapSection0.SpriteBuffer_getSprite(field1799, this.field1811, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field1811);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Lle;",
		garbageValue = "-1825391526"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = field1799;
				AbstractArchive var4 = HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!BuddyRankComparator.SpriteBuffer_loadSpritesFromArchive(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, class414.SpriteBuffer_xOffsets, class414.SpriteBuffer_yOffsets, UrlRequester.SpriteBuffer_spriteWidths, class414.SpriteBuffer_spriteHeights, SpriteBuffer_spritePalette, class295.SpriteBuffer_pixels);
						PacketBuffer.method6913();
						var6 = var8;
					}

					var2 = var6;
				}

				if (var2 != null) {
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "28"
	)
	static final void method3267(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class115.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method2809()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketWriter var5 = Client.packetWriter;
				PacketBufferNode var6 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2750, var5.isaacCipher);
				var6.packetBuffer.writeByte(3 + Client.stringCp1252NullTerminatedByteSize(var4));
				var6.packetBuffer.writeByte(var0);
				var6.packetBuffer.writeShort(var1);
				var6.packetBuffer.writeStringCp1252NullTerminated(var4);
				var5.addNode(var6);
			}
		}
	}
}
