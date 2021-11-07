import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("i")
	int field318;
	@ObfuscatedName("s")
	int field309;
	@ObfuscatedName("a")
	int field307;
	@ObfuscatedName("o")
	int field308;
	@ObfuscatedName("g")
	int field311;
	@ObfuscatedName("e")
	int field310;
	@ObfuscatedName("p")
	int field305;
	@ObfuscatedName("j")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("b")
	@Export("start")
	int start;
	@ObfuscatedName("x")
	@Export("end")
	int end;
	@ObfuscatedName("y")
	boolean field315;
	@ObfuscatedName("k")
	int field316;
	@ObfuscatedName("t")
	int field317;
	@ObfuscatedName("l")
	int field306;
	@ObfuscatedName("u")
	int field319;

	@ObfuscatedSignature(
		descriptor = "(Laz;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field315 = var1.field238;
		this.field309 = var2;
		this.field307 = var3;
		this.field308 = var4;
		this.field318 = 0;
		this.method818();
	}

	@ObfuscatedSignature(
		descriptor = "(Laz;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field315 = var1.field238;
		this.field309 = var2;
		this.field307 = var3;
		this.field308 = 8192;
		this.field318 = 0;
		this.method818();
	}

	@ObfuscatedName("o")
	void method818() {
		this.field311 = this.field307;
		this.field310 = method826(this.field307, this.field308);
		this.field305 = method968(this.field307, this.field308);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "()Lav;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("p")
	protected int vmethod4958() {
		return this.field307 == 0 && this.field316 == 0 ? 0 : 1;
	}

	@ObfuscatedName("j")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field307 == 0 && this.field316 == 0) {
			this.skip(var3);
		} else {
			RawSound var4 = (RawSound)super.sound;
			int var5 = this.start << 8;
			int var6 = this.end << 8;
			int var7 = var4.samples.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.numLoops = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field318 < 0) {
				if (this.field309 <= 0) {
					this.method915();
					this.remove();
					return;
				}

				this.field318 = 0;
			}

			if (this.field318 >= var7) {
				if (this.field309 >= 0) {
					this.method915();
					this.remove();
					return;
				}

				this.field318 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field315) {
					if (this.field309 < 0) {
						var9 = this.method841(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field318 >= var5) {
							return;
						}

						this.field318 = var5 + var5 - 1 - this.field318;
						this.field309 = -this.field309;
					}

					while (true) {
						var9 = this.method827(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field318 < var6) {
							return;
						}

						this.field318 = var6 + var6 - 1 - this.field318;
						this.field309 = -this.field309;
						var9 = this.method841(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field318 >= var5) {
							return;
						}

						this.field318 = var5 + var5 - 1 - this.field318;
						this.field309 = -this.field309;
					}
				} else if (this.field309 < 0) {
					while (true) {
						var9 = this.method841(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field318 >= var5) {
							return;
						}

						this.field318 = var6 - 1 - (var6 - 1 - this.field318) % var8;
					}
				} else {
					while (true) {
						var9 = this.method827(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field318 < var6) {
							return;
						}

						this.field318 = var5 + (this.field318 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field315) {
						label127: {
							if (this.field309 < 0) {
								var9 = this.method841(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field318 >= var5) {
									return;
								}

								this.field318 = var5 + var5 - 1 - this.field318;
								this.field309 = -this.field309;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method827(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field318 < var6) {
									return;
								}

								this.field318 = var6 + var6 - 1 - this.field318;
								this.field309 = -this.field309;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method841(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field318 >= var5) {
									return;
								}

								this.field318 = var5 + var5 - 1 - this.field318;
								this.field309 = -this.field309;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field309 < 0) {
							while (true) {
								var9 = this.method841(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field318 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field318) / var8;
								if (var10 >= this.numLoops) {
									this.field318 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field318 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method827(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field318 < var6) {
									return;
								}

								var10 = (this.field318 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field318 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field318 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field309 < 0) {
					this.method841(var1, var9, 0, var3, 0);
					if (this.field318 < 0) {
						this.field318 = -1;
						this.method915();
						this.remove();
					}
				} else {
					this.method827(var1, var9, var7, var3, 0);
					if (this.field318 >= var7) {
						this.field318 = var7;
						this.method915();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("b")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("x")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field316 > 0) {
			if (var1 >= this.field316) {
				if (this.field307 == Integer.MIN_VALUE) {
					this.field307 = 0;
					this.field305 = 0;
					this.field310 = 0;
					this.field311 = 0;
					this.remove();
					var1 = this.field316;
				}

				this.field316 = 0;
				this.method818();
			} else {
				this.field311 += this.field317 * var1;
				this.field310 += this.field306 * var1;
				this.field305 += this.field319 * var1;
				this.field316 -= var1;
			}
		}

		RawSound var2 = (RawSound)super.sound;
		int var3 = this.start << 8;
		int var4 = this.end << 8;
		int var5 = var2.samples.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.numLoops = 0;
		}

		if (this.field318 < 0) {
			if (this.field309 <= 0) {
				this.method915();
				this.remove();
				return;
			}

			this.field318 = 0;
		}

		if (this.field318 >= var5) {
			if (this.field309 >= 0) {
				this.method915();
				this.remove();
				return;
			}

			this.field318 = var5 - 1;
		}

		this.field318 += this.field309 * var1;
		if (this.numLoops < 0) {
			if (!this.field315) {
				if (this.field309 < 0) {
					if (this.field318 >= var3) {
						return;
					}

					this.field318 = var4 - 1 - (var4 - 1 - this.field318) % var6;
				} else {
					if (this.field318 < var4) {
						return;
					}

					this.field318 = var3 + (this.field318 - var3) % var6;
				}

			} else {
				if (this.field309 < 0) {
					if (this.field318 >= var3) {
						return;
					}

					this.field318 = var3 + var3 - 1 - this.field318;
					this.field309 = -this.field309;
				}

				while (this.field318 >= var4) {
					this.field318 = var4 + var4 - 1 - this.field318;
					this.field309 = -this.field309;
					if (this.field318 >= var3) {
						return;
					}

					this.field318 = var3 + var3 - 1 - this.field318;
					this.field309 = -this.field309;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field315) {
					label129: {
						if (this.field309 < 0) {
							if (this.field318 >= var3) {
								return;
							}

							this.field318 = var3 + var3 - 1 - this.field318;
							this.field309 = -this.field309;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field318 < var4) {
								return;
							}

							this.field318 = var4 + var4 - 1 - this.field318;
							this.field309 = -this.field309;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field318 >= var3) {
								return;
							}

							this.field318 = var3 + var3 - 1 - this.field318;
							this.field309 = -this.field309;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field309 < 0) {
							if (this.field318 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field318) / var6;
							if (var7 >= this.numLoops) {
								this.field318 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field318 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field318 < var4) {
								return;
							}

							var7 = (this.field318 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field318 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field318 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field309 < 0) {
				if (this.field318 < 0) {
					this.field318 = -1;
					this.method915();
					this.remove();
				}
			} else if (this.field318 >= var5) {
				this.field318 = var5;
				this.method915();
				this.remove();
			}

		}
	}

	@ObfuscatedName("y")
	public synchronized void method821(int var1) {
		this.method822(var1 << 6, this.method824());
	}

	@ObfuscatedName("k")
	synchronized void method927(int var1) {
		this.method822(var1, this.method824());
	}

	@ObfuscatedName("t")
	synchronized void method822(int var1, int var2) {
		this.field307 = var1;
		this.field308 = var2;
		this.field316 = 0;
		this.method818();
	}

	@ObfuscatedName("l")
	public synchronized int method936() {
		return this.field307 == Integer.MIN_VALUE ? 0 : this.field307;
	}

	@ObfuscatedName("u")
	public synchronized int method824() {
		return this.field308 < 0 ? -1 : this.field308;
	}

	@ObfuscatedName("n")
	public synchronized void method825(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field318 = var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method922() {
		this.field309 = (this.field309 ^ this.field309 >> 31) + (this.field309 >>> 31);
		this.field309 = -this.field309;
	}

	@ObfuscatedName("q")
	void method915() {
		if (this.field316 != 0) {
			if (this.field307 == Integer.MIN_VALUE) {
				this.field307 = 0;
			}

			this.field316 = 0;
			this.method818();
		}

	}

	@ObfuscatedName("d")
	public synchronized void method941(int var1, int var2) {
		this.method829(var1, var2, this.method824());
	}

	@ObfuscatedName("r")
	public synchronized void method829(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method822(var2, var3);
		} else {
			int var4 = method826(var2, var3);
			int var5 = method968(var2, var3);
			if (var4 == this.field310 && var5 == this.field305) {
				this.field316 = 0;
			} else {
				int var6 = var2 - this.field311;
				if (this.field311 - var2 > var6) {
					var6 = this.field311 - var2;
				}

				if (var4 - this.field310 > var6) {
					var6 = var4 - this.field310;
				}

				if (this.field310 - var4 > var6) {
					var6 = this.field310 - var4;
				}

				if (var5 - this.field305 > var6) {
					var6 = var5 - this.field305;
				}

				if (this.field305 - var5 > var6) {
					var6 = this.field305 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field316 = var1;
				this.field307 = var2;
				this.field308 = var3;
				this.field317 = (var2 - this.field311) / var1;
				this.field306 = (var4 - this.field310) / var1;
				this.field319 = (var5 - this.field305) / var1;
			}
		}
	}

	@ObfuscatedName("m")
	public synchronized void method830(int var1) {
		if (var1 == 0) {
			this.method927(0);
			this.remove();
		} else if (this.field310 == 0 && this.field305 == 0) {
			this.field316 = 0;
			this.field307 = 0;
			this.field311 = 0;
			this.remove();
		} else {
			int var2 = -this.field311;
			if (this.field311 > var2) {
				var2 = this.field311;
			}

			if (-this.field310 > var2) {
				var2 = -this.field310;
			}

			if (this.field310 > var2) {
				var2 = this.field310;
			}

			if (-this.field305 > var2) {
				var2 = -this.field305;
			}

			if (this.field305 > var2) {
				var2 = this.field305;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field316 = var1;
			this.field307 = Integer.MIN_VALUE;
			this.field317 = -this.field311 / var1;
			this.field306 = -this.field310 / var1;
			this.field319 = -this.field305 / var1;
		}
	}

	@ObfuscatedName("c")
	public synchronized void method912(int var1) {
		if (this.field309 < 0) {
			this.field309 = -var1;
		} else {
			this.field309 = var1;
		}

	}

	@ObfuscatedName("f")
	public synchronized int method832() {
		return this.field309 < 0 ? -this.field309 : this.field309;
	}

	@ObfuscatedName("h")
	public boolean method833() {
		return this.field318 < 0 || this.field318 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("v")
	public boolean method834() {
		return this.field316 != 0;
	}

	@ObfuscatedName("ab")
	int method827(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field316 > 0) {
				int var6 = var2 + this.field316;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field316 += var2;
				if (this.field309 == 256 && (this.field318 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method852(0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field310, this.field305, this.field306, this.field319, 0, var6, var3, this);
					} else {
						var2 = method960(((RawSound)super.sound).samples, var1, this.field318, var2, this.field311, this.field317, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method856(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field310, this.field305, this.field306, this.field319, 0, var6, var3, this, this.field309, var5);
				} else {
					var2 = method855(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field311, this.field317, 0, var6, var3, this, this.field309, var5);
				}

				this.field316 -= var2;
				if (this.field316 != 0) {
					return var2;
				}

				if (!this.method954()) {
					continue;
				}

				return var4;
			}

			if (this.field309 == 256 && (this.field318 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method962(0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field310, this.field305, 0, var4, var3, this);
				}

				return method843(((RawSound)super.sound).samples, var1, this.field318, var2, this.field311, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method848(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field310, this.field305, 0, var4, var3, this, this.field309, var5);
			}

			return method847(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field311, 0, var4, var3, this, this.field309, var5);
		}
	}

	@ObfuscatedName("ar")
	int method841(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field316 > 0) {
				int var6 = var2 + this.field316;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field316 += var2;
				if (this.field309 == -256 && (this.field318 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method854(0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field310, this.field305, this.field306, this.field319, 0, var6, var3, this);
					} else {
						var2 = method831(((RawSound)super.sound).samples, var1, this.field318, var2, this.field311, this.field317, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method858(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field310, this.field305, this.field306, this.field319, 0, var6, var3, this, this.field309, var5);
				} else {
					var2 = method899(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field311, this.field317, 0, var6, var3, this, this.field309, var5);
				}

				this.field316 -= var2;
				if (this.field316 != 0) {
					return var2;
				}

				if (!this.method954()) {
					continue;
				}

				return var4;
			}

			if (this.field309 == -256 && (this.field318 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method846(0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field310, this.field305, 0, var4, var3, this);
				}

				return method845(((RawSound)super.sound).samples, var1, this.field318, var2, this.field311, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method850(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field310, this.field305, 0, var4, var3, this, this.field309, var5);
			}

			return method849(0, 0, ((RawSound)super.sound).samples, var1, this.field318, var2, this.field311, 0, var4, var3, this, this.field309, var5);
		}
	}

	@ObfuscatedName("ad")
	boolean method954() {
		int var1 = this.field307;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method826(var1, this.field308);
			var3 = method968(var1, this.field308);
		}

		if (var1 == this.field311 && var2 == this.field310 && var3 == this.field305) {
			if (this.field307 == Integer.MIN_VALUE) {
				this.field307 = 0;
				this.field305 = 0;
				this.field310 = 0;
				this.field311 = 0;
				this.remove();
				return true;
			} else {
				this.method818();
				return false;
			}
		} else {
			if (this.field311 < var1) {
				this.field317 = 1;
				this.field316 = var1 - this.field311;
			} else if (this.field311 > var1) {
				this.field317 = -1;
				this.field316 = this.field311 - var1;
			} else {
				this.field317 = 0;
			}

			if (this.field310 < var2) {
				this.field306 = 1;
				if (this.field316 == 0 || this.field316 > var2 - this.field310) {
					this.field316 = var2 - this.field310;
				}
			} else if (this.field310 > var2) {
				this.field306 = -1;
				if (this.field316 == 0 || this.field316 > this.field310 - var2) {
					this.field316 = this.field310 - var2;
				}
			} else {
				this.field306 = 0;
			}

			if (this.field305 < var3) {
				this.field319 = 1;
				if (this.field316 == 0 || this.field316 > var3 - this.field305) {
					this.field316 = var3 - this.field305;
				}
			} else if (this.field305 > var3) {
				this.field319 = -1;
				if (this.field316 == 0 || this.field316 > this.field305 - var3) {
					this.field316 = this.field305 - var3;
				}
			} else {
				this.field319 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("au")
	int vmethod974() {
		int var1 = this.field311 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field318 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("i")
	static int method826(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("w")
	static int method968(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Laz;II)Lax;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(UserComparator2.field4359 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Laz;III)Lax;"
	)
	public static RawPcmStream method817(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILax;)I"
	)
	static int method843(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.field318 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILax;)I"
	)
	static int method962(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field318 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILax;)I"
	)
	static int method845(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.field318 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILax;)I"
	)
	static int method846(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field318 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILax;II)I"
	)
	static int method847(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.field318 = var4;
		return var5;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILax;II)I"
	)
	static int method848(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field318 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILax;II)I"
	)
	static int method849(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.field318 = var4;
		return var5;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILax;II)I"
	)
	static int method850(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field318 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILax;)I"
	)
	static int method960(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field310 += var9.field306 * (var6 - var3);
		var9.field305 += var9.field319 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field311 = var4 >> 2;
		var9.field318 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILax;)I"
	)
	static int method852(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field311 += var12.field317 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field310 = var5 >> 2;
		var12.field305 = var6 >> 2;
		var12.field318 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILax;)I"
	)
	static int method831(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field310 += var9.field306 * (var6 - var3);
		var9.field305 += var9.field319 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field311 = var4 >> 2;
		var9.field318 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILax;)I"
	)
	static int method854(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field311 += var12.field317 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field310 = var5 >> 2;
		var12.field305 = var6 >> 2;
		var12.field318 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILax;II)I"
	)
	static int method855(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field310 -= var11.field306 * var5;
		var11.field305 -= var11.field319 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field310 += var11.field306 * var5;
		var11.field305 += var11.field319 * var5;
		var11.field311 = var6;
		var11.field318 = var4;
		return var5;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILax;II)I"
	)
	static int method856(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field311 -= var5 * var13.field317;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field311 += var13.field317 * var5;
		var13.field310 = var6;
		var13.field305 = var7;
		var13.field318 = var4;
		return var5;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILax;II)I"
	)
	static int method899(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field310 -= var11.field306 * var5;
		var11.field305 -= var11.field319 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field310 += var11.field306 * var5;
		var11.field305 += var11.field319 * var5;
		var11.field311 = var6;
		var11.field318 = var4;
		return var5;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILax;II)I"
	)
	static int method858(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field311 -= var5 * var13.field317;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field311 += var13.field317 * var5;
		var13.field310 = var6;
		var13.field305 = var7;
		var13.field318 = var4;
		return var5;
	}
}
